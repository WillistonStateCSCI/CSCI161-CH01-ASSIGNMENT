#!/usr/bin/env bash
set -uo pipefail

FAILED=0

run_exercise () {
  local dir="$1"
  local src_class="$2"
  local grader_class="$3"

  echo "=============================="
  echo "Testing $dir ($src_class)"
  echo "=============================="

  local workdir
  workdir=$(mktemp -d)

  cp "$dir/$src_class.java" "$workdir/"
  cp ".github/tests/$grader_class.java" "$workdir/"

  pushd "$workdir" > /dev/null

  javac "$src_class.java" "$grader_class.java" 2> compile_errors.txt
  if [ $? -ne 0 ]; then
    echo "COMPILE FAILED for $dir"
    cat compile_errors.txt
    FAILED=1
    popd > /dev/null
    rm -rf "$workdir"
    return
  fi

  java "$grader_class"
  if [ $? -ne 0 ]; then
    FAILED=1
  fi

  popd > /dev/null
  rm -rf "$workdir"
}

run_exercise "1.03" "R1_03" "Grader_1_03"
run_exercise "1.06" "R1_06" "Grader_1_06"
run_exercise "1.08" "R1_08" "Grader_1_08"
run_exercise "1.19" "C1_19" "Grader_1_19"
run_exercise "1.21" "C1_21" "Grader_1_21"
run_exercise "1.28" "P1_28" "Grader_1_28"

echo "=============================="
if [ "$FAILED" -ne 0 ]; then
  echo "One or more exercises FAILED"
  exit 1
else
  echo "All exercises PASSED"
  exit 0
fi
