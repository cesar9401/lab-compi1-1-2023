import { Instruction } from "src/app/model/instruction";
import { OperationType } from "src/app/model/operation-type";
import { SymbolTable } from "src/app/model/symbol-table";

export class BinaryOperation extends Instruction {
  type: OperationType;
  leftOperator: Instruction;
  rightOperator: Instruction;

  constructor(
    line: number,
    column: number,
    type: OperationType,
    leftOperator: Instruction,
    rightOperator: Instruction
  ) {
    super(line, column);
    this.type = type;
    this.leftOperator = leftOperator;
    this.rightOperator = rightOperator;
  }

  run(table: SymbolTable) {
  }
}
