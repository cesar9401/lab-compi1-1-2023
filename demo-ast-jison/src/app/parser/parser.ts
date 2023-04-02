import { Assignment } from "src/app/model/assignment";
import { BinaryOperation } from "src/app/model/binary-operation";
import { Declaration } from "src/app/model/declaration";
import { Instruction } from "src/app/model/instruction";
import { OperationType } from "src/app/model/operation-type";
import { Print } from "src/app/model/print";
import { SymbolTable } from "src/app/model/symbol-table";
import { Value, ValueType } from "src/app/model/value";
import { Variable, VariableType } from "src/app/model/variable";
import { While } from "src/app/model/while";

declare var parser: any;

export class Parser {
  private instructions: Instruction[] = [];
  private source: string;

  constructor(source: string) {
    this.source = source;
    parser.yy.While = While;
    parser.yy.Print = Print;
    parser.yy.Assignment = Assignment;
    parser.yy.Declaration = Declaration;
    parser.yy.BinaryOperation = BinaryOperation;
    parser.yy.Variable = Variable;
    parser.yy.SymbolTable = SymbolTable;
    parser.yy.VariableType = VariableType;
    parser.yy.OperationType = OperationType;
    parser.yy.Value = Value;
    parser.yy.ValueType = ValueType;
  }

  parse() {
    try {
      this.instructions = parser.parse(this.source);

      const table = new SymbolTable();
      this.instructions.forEach(i => {
        i.run(table);
      });
    } catch(error) {
      console.error(error);
    }
  }
}
