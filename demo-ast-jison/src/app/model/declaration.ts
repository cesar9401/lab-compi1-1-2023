import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";
import { VariableType } from "src/app/model/variable";

export class Declaration extends Instruction {
  type: VariableType;
  id: string;
  operation: Instruction;

  constructor(
    line: number,
    column: number,
    type: VariableType,
    id: string,
    operation: Instruction
  ) {
    super(line, column);
    this.type = type;
    this.id = id;
    this.operation = operation;
  }

  run(table: SymbolTable) {
  }
}
