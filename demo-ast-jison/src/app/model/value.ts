import { Instruction } from "src/app/model/instruction";
import { SymbolTable } from "src/app/model/symbol-table";
import { Variable, VariableType } from "src/app/model/variable";

export class Value extends Instruction {
  value: any;
  type: ValueType

  constructor(
    line: number,
    column: number,
    value: any,
    type: ValueType
  ) {
    super(line, column);
    this.value = value;
    this.type = type;
  }

  run(table: SymbolTable): Variable | undefined {
    let variable = new Variable();
    switch (this.type) {
      case ValueType.INTEGER:
        variable.type = VariableType.INTEGER;
        variable.value = Number(this.value);
        return variable;
      case ValueType.DECIMAL:
        variable.type = VariableType.DOUBLE;
        variable.value = Number(this.value);
        return variable;
      case ValueType.ID:
        const variable1 = table.getById(String(this.value));
        if (!variable1) {
          throw new Error(`Variable ${this.value} no ha sido declarada`);
        }
        Object.assign(variable, variable1);
        return variable;
    }

    return undefined;
  }
}

export enum ValueType {
  INTEGER,
  DECIMAL,
  ID
}
