/* parser generated by jison 0.4.18 */
/*
  Returns a Parser object of the following structure:

  Parser: {
    yy: {}
  }

  Parser.prototype: {
    yy: {},
    trace: function(),
    symbols_: {associative list: name ==> number},
    terminals_: {associative list: number ==> name},
    productions_: [...],
    performAction: function anonymous(yytext, yyleng, yylineno, yy, yystate, $$, _$),
    table: [...],
    defaultActions: {...},
    parseError: function(str, hash),
    parse: function(input),

    lexer: {
        EOF: 1,
        parseError: function(str, hash),
        setInput: function(input),
        input: function(),
        unput: function(str),
        more: function(),
        less: function(n),
        pastInput: function(),
        upcomingInput: function(),
        showPosition: function(),
        test_match: function(regex_match_array, rule_index),
        next: function(),
        lex: function(),
        begin: function(condition),
        popState: function(),
        _currentRules: function(),
        topState: function(),
        pushState: function(condition),

        options: {
            ranges: boolean           (optional: true ==> token location info will include a .range[] member)
            flex: boolean             (optional: true ==> flex-like lexing behaviour where the rules are tested exhaustively to find the longest match)
            backtrack_lexer: boolean  (optional: true ==> lexer regexes are tested in order and for each matching regex the action code is invoked; the lexer terminates the scan when a token is returned by the action code)
        },

        performAction: function(yy, yy_, $avoiding_name_collisions, YY_START),
        rules: [...],
        conditions: {associative list: name ==> set},
    }
  }


  token location info (@$, _$, etc.): {
    first_line: n,
    last_line: n,
    first_column: n,
    last_column: n,
    range: [start_number, end_number]       (where the numbers are indexes into the input string, regular zero-based)
  }


  the parseError function receives a 'hash' object with these members for lexer and parser errors: {
    text:        (matched text)
    token:       (the produced terminal token, if any)
    line:        (yylineno)
  }
  while parser (grammar) errors will also provide these members, i.e. parser errors deliver a superset of attributes: {
    loc:         (yylloc)
    expected:    (string describing the set of expected tokens)
    recoverable: (boolean: TRUE when the parser has a error recovery rule available for this particular error)
  }
*/
var parser = (function(){
var o=function(k,v,o,l){for(o=o||{},l=k.length;l--;o[k[l]]=v);return o},$V0=[2,3],$V1=[1,11],$V2=[1,12],$V3=[1,9],$V4=[1,13],$V5=[1,14],$V6=[5,11,16,17,19,22,23],$V7=[1,33],$V8=[1,32],$V9=[1,28],$Va=[1,25],$Vb=[1,26],$Vc=[1,30],$Vd=[1,31],$Ve=[1,38],$Vf=[14,18,24,41],$Vg=[1,39],$Vh=[14,18,24,26,41],$Vi=[1,40],$Vj=[1,41],$Vk=[1,42],$Vl=[1,43],$Vm=[14,18,24,26,28,30,31,32,41],$Vn=[1,44],$Vo=[1,45],$Vp=[14,18,24,26,28,30,31,32,33,35,41],$Vq=[1,46],$Vr=[1,47],$Vs=[1,48],$Vt=[14,18,24,26,28,30,31,32,33,35,36,38,39,41];
var parser = {trace: function trace () { },
yy: {},
symbols_: {"error":2,"initial":3,"statements":4,"EOF":5,"statement":6,"assign_stmt":7,"declaration_stmt":8,"while_stmt":9,"println_stmt":10,"WHILE":11,"LPAREN":12,"a":13,"RPAREN":14,"LBRACE":15,"RBRACE":16,"PRINTLN":17,"SEMI":18,"ID":19,"EQ":20,"type":21,"INT":22,"DOUBLE":23,"OR":24,"b":25,"AND":26,"c":27,"GREATER":28,"d":29,"LESS":30,"EQEQ":31,"NEQ":32,"PLUS":33,"e":34,"MINUS":35,"TIMES":36,"f":37,"DIVIDE":38,"MOD":39,"POW":40,"COMMA":41,"SQRT":42,"g":43,"h":44,"DECIMAL":45,"INTEGER":46,"$accept":0,"$end":1},
terminals_: {2:"error",5:"EOF",11:"WHILE",12:"LPAREN",14:"RPAREN",15:"LBRACE",16:"RBRACE",17:"PRINTLN",18:"SEMI",19:"ID",20:"EQ",22:"INT",23:"DOUBLE",24:"OR",26:"AND",28:"GREATER",30:"LESS",31:"EQEQ",32:"NEQ",33:"PLUS",35:"MINUS",36:"TIMES",38:"DIVIDE",39:"MOD",40:"POW",41:"COMMA",42:"SQRT",45:"DECIMAL",46:"INTEGER"},
productions_: [0,[3,2],[4,2],[4,0],[6,1],[6,1],[6,1],[6,1],[9,7],[10,5],[7,4],[8,5],[21,1],[21,1],[13,3],[13,1],[25,3],[25,1],[27,3],[27,3],[27,3],[27,3],[27,1],[29,3],[29,3],[29,1],[34,3],[34,3],[34,3],[34,1],[37,6],[37,4],[37,1],[43,2],[43,1],[44,1],[44,1],[44,1],[44,3]],
performAction: function anonymous(yytext, yyleng, yylineno, yy, yystate /* action[1] */, $$ /* vstack */, _$ /* lstack */) {
/* this == yyval */

var $0 = $$.length - 1;
switch (yystate) {
case 1:
 return 0; 
break;
}
},
table: [o([5,11,17,19,22,23],$V0,{3:1,4:2}),{1:[3]},{5:[1,3],6:4,7:5,8:6,9:7,10:8,11:$V1,17:$V2,19:$V3,21:10,22:$V4,23:$V5},{1:[2,1]},o($V6,[2,2]),o($V6,[2,4]),o($V6,[2,5]),o($V6,[2,6]),o($V6,[2,7]),{20:[1,15]},{19:[1,16]},{12:[1,17]},{12:[1,18]},{19:[2,12]},{19:[2,13]},{12:$V7,13:19,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{20:[1,34]},{12:$V7,13:35,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,13:36,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{18:[1,37],24:$Ve},o($Vf,[2,15],{26:$Vg}),o($Vh,[2,17],{28:$Vi,30:$Vj,31:$Vk,32:$Vl}),o($Vm,[2,22],{33:$Vn,35:$Vo}),o($Vp,[2,25],{36:$Vq,38:$Vr,39:$Vs}),o($Vt,[2,29]),{12:[1,49]},{12:[1,50]},o($Vt,[2,32]),{12:$V7,19:$V8,44:51,45:$Vc,46:$Vd},o($Vt,[2,34]),o($Vt,[2,35]),o($Vt,[2,36]),o($Vt,[2,37]),{12:$V7,13:52,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,13:53,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{14:[1,54],24:$Ve},{14:[1,55],24:$Ve},o($V6,[2,10]),{12:$V7,19:$V8,25:56,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,27:57,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,29:58,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,29:59,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,29:60,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,29:61,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,34:62,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,34:63,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,35:$V9,37:64,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,35:$V9,37:65,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,19:$V8,35:$V9,37:66,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,13:67,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},{12:$V7,13:68,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},o($Vt,[2,33]),{14:[1,69],24:$Ve},{18:[1,70],24:$Ve},{15:[1,71]},{18:[1,72]},o($Vf,[2,14],{26:$Vg}),o($Vh,[2,16],{28:$Vi,30:$Vj,31:$Vk,32:$Vl}),o($Vm,[2,18],{33:$Vn,35:$Vo}),o($Vm,[2,19],{33:$Vn,35:$Vo}),o($Vm,[2,20],{33:$Vn,35:$Vo}),o($Vm,[2,21],{33:$Vn,35:$Vo}),o($Vp,[2,23],{36:$Vq,38:$Vr,39:$Vs}),o($Vp,[2,24],{36:$Vq,38:$Vr,39:$Vs}),o($Vt,[2,26]),o($Vt,[2,27]),o($Vt,[2,28]),{24:$Ve,41:[1,73]},{14:[1,74],24:$Ve},o($Vt,[2,38]),o($V6,[2,11]),o([11,16,17,19,22,23],$V0,{4:75}),o($V6,[2,9]),{12:$V7,13:76,19:$V8,25:20,27:21,29:22,34:23,35:$V9,37:24,40:$Va,42:$Vb,43:27,44:29,45:$Vc,46:$Vd},o($Vt,[2,31]),{6:4,7:5,8:6,9:7,10:8,11:$V1,16:[1,77],17:$V2,19:$V3,21:10,22:$V4,23:$V5},{14:[1,78],24:$Ve},o($V6,[2,8]),o($Vt,[2,30])],
defaultActions: {3:[2,1],13:[2,12],14:[2,13]},
parseError: function parseError (str, hash) {
    if (hash.recoverable) {
        this.trace(str);
    } else {
        var error = new Error(str);
        error.hash = hash;
        throw error;
    }
},
parse: function parse(input) {
    var self = this, stack = [0], tstack = [], vstack = [null], lstack = [], table = this.table, yytext = '', yylineno = 0, yyleng = 0, recovering = 0, TERROR = 2, EOF = 1;
    var args = lstack.slice.call(arguments, 1);
    var lexer = Object.create(this.lexer);
    var sharedState = { yy: {} };
    for (var k in this.yy) {
        if (Object.prototype.hasOwnProperty.call(this.yy, k)) {
            sharedState.yy[k] = this.yy[k];
        }
    }
    lexer.setInput(input, sharedState.yy);
    sharedState.yy.lexer = lexer;
    sharedState.yy.parser = this;
    if (typeof lexer.yylloc == 'undefined') {
        lexer.yylloc = {};
    }
    var yyloc = lexer.yylloc;
    lstack.push(yyloc);
    var ranges = lexer.options && lexer.options.ranges;
    if (typeof sharedState.yy.parseError === 'function') {
        this.parseError = sharedState.yy.parseError;
    } else {
        this.parseError = Object.getPrototypeOf(this).parseError;
    }
    function popStack(n) {
        stack.length = stack.length - 2 * n;
        vstack.length = vstack.length - n;
        lstack.length = lstack.length - n;
    }
    _token_stack:
        var lex = function () {
            var token;
            token = lexer.lex() || EOF;
            if (typeof token !== 'number') {
                token = self.symbols_[token] || token;
            }
            return token;
        };
    var symbol, preErrorSymbol, state, action, a, r, yyval = {}, p, len, newState, expected;
    while (true) {
        state = stack[stack.length - 1];
        if (this.defaultActions[state]) {
            action = this.defaultActions[state];
        } else {
            if (symbol === null || typeof symbol == 'undefined') {
                symbol = lex();
            }
            action = table[state] && table[state][symbol];
        }
                    if (typeof action === 'undefined' || !action.length || !action[0]) {
                var errStr = '';
                expected = [];
                for (p in table[state]) {
                    if (this.terminals_[p] && p > TERROR) {
                        expected.push('\'' + this.terminals_[p] + '\'');
                    }
                }
                if (lexer.showPosition) {
                    errStr = 'Parse error on line ' + (yylineno + 1) + ':\n' + lexer.showPosition() + '\nExpecting ' + expected.join(', ') + ', got \'' + (this.terminals_[symbol] || symbol) + '\'';
                } else {
                    errStr = 'Parse error on line ' + (yylineno + 1) + ': Unexpected ' + (symbol == EOF ? 'end of input' : '\'' + (this.terminals_[symbol] || symbol) + '\'');
                }
                this.parseError(errStr, {
                    text: lexer.match,
                    token: this.terminals_[symbol] || symbol,
                    line: lexer.yylineno,
                    loc: yyloc,
                    expected: expected
                });
            }
        if (action[0] instanceof Array && action.length > 1) {
            throw new Error('Parse Error: multiple actions possible at state: ' + state + ', token: ' + symbol);
        }
        switch (action[0]) {
        case 1:
            stack.push(symbol);
            vstack.push(lexer.yytext);
            lstack.push(lexer.yylloc);
            stack.push(action[1]);
            symbol = null;
            if (!preErrorSymbol) {
                yyleng = lexer.yyleng;
                yytext = lexer.yytext;
                yylineno = lexer.yylineno;
                yyloc = lexer.yylloc;
                if (recovering > 0) {
                    recovering--;
                }
            } else {
                symbol = preErrorSymbol;
                preErrorSymbol = null;
            }
            break;
        case 2:
            len = this.productions_[action[1]][1];
            yyval.$ = vstack[vstack.length - len];
            yyval._$ = {
                first_line: lstack[lstack.length - (len || 1)].first_line,
                last_line: lstack[lstack.length - 1].last_line,
                first_column: lstack[lstack.length - (len || 1)].first_column,
                last_column: lstack[lstack.length - 1].last_column
            };
            if (ranges) {
                yyval._$.range = [
                    lstack[lstack.length - (len || 1)].range[0],
                    lstack[lstack.length - 1].range[1]
                ];
            }
            r = this.performAction.apply(yyval, [
                yytext,
                yyleng,
                yylineno,
                sharedState.yy,
                action[1],
                vstack,
                lstack
            ].concat(args));
            if (typeof r !== 'undefined') {
                return r;
            }
            if (len) {
                stack = stack.slice(0, -1 * len * 2);
                vstack = vstack.slice(0, -1 * len);
                lstack = lstack.slice(0, -1 * len);
            }
            stack.push(this.productions_[action[1]][0]);
            vstack.push(yyval.$);
            lstack.push(yyval._$);
            newState = table[stack[stack.length - 2]][stack[stack.length - 1]];
            stack.push(newState);
            break;
        case 3:
            return true;
        }
    }
    return true;
}};
/* generated by jison-lex 0.3.4 */
var lexer = (function(){
var lexer = ({

EOF:1,

parseError:function parseError(str, hash) {
        if (this.yy.parser) {
            this.yy.parser.parseError(str, hash);
        } else {
            throw new Error(str);
        }
    },

// resets the lexer, sets new input
setInput:function (input, yy) {
        this.yy = yy || this.yy || {};
        this._input = input;
        this._more = this._backtrack = this.done = false;
        this.yylineno = this.yyleng = 0;
        this.yytext = this.matched = this.match = '';
        this.conditionStack = ['INITIAL'];
        this.yylloc = {
            first_line: 1,
            first_column: 0,
            last_line: 1,
            last_column: 0
        };
        if (this.options.ranges) {
            this.yylloc.range = [0,0];
        }
        this.offset = 0;
        return this;
    },

// consumes and returns one char from the input
input:function () {
        var ch = this._input[0];
        this.yytext += ch;
        this.yyleng++;
        this.offset++;
        this.match += ch;
        this.matched += ch;
        var lines = ch.match(/(?:\r\n?|\n).*/g);
        if (lines) {
            this.yylineno++;
            this.yylloc.last_line++;
        } else {
            this.yylloc.last_column++;
        }
        if (this.options.ranges) {
            this.yylloc.range[1]++;
        }

        this._input = this._input.slice(1);
        return ch;
    },

// unshifts one char (or a string) into the input
unput:function (ch) {
        var len = ch.length;
        var lines = ch.split(/(?:\r\n?|\n)/g);

        this._input = ch + this._input;
        this.yytext = this.yytext.substr(0, this.yytext.length - len);
        //this.yyleng -= len;
        this.offset -= len;
        var oldLines = this.match.split(/(?:\r\n?|\n)/g);
        this.match = this.match.substr(0, this.match.length - 1);
        this.matched = this.matched.substr(0, this.matched.length - 1);

        if (lines.length - 1) {
            this.yylineno -= lines.length - 1;
        }
        var r = this.yylloc.range;

        this.yylloc = {
            first_line: this.yylloc.first_line,
            last_line: this.yylineno + 1,
            first_column: this.yylloc.first_column,
            last_column: lines ?
                (lines.length === oldLines.length ? this.yylloc.first_column : 0)
                 + oldLines[oldLines.length - lines.length].length - lines[0].length :
              this.yylloc.first_column - len
        };

        if (this.options.ranges) {
            this.yylloc.range = [r[0], r[0] + this.yyleng - len];
        }
        this.yyleng = this.yytext.length;
        return this;
    },

// When called from action, caches matched text and appends it on next action
more:function () {
        this._more = true;
        return this;
    },

// When called from action, signals the lexer that this rule fails to match the input, so the next matching rule (regex) should be tested instead.
reject:function () {
        if (this.options.backtrack_lexer) {
            this._backtrack = true;
        } else {
            return this.parseError('Lexical error on line ' + (this.yylineno + 1) + '. You can only invoke reject() in the lexer when the lexer is of the backtracking persuasion (options.backtrack_lexer = true).\n' + this.showPosition(), {
                text: "",
                token: null,
                line: this.yylineno
            });

        }
        return this;
    },

// retain first n characters of the match
less:function (n) {
        this.unput(this.match.slice(n));
    },

// displays already matched input, i.e. for error messages
pastInput:function () {
        var past = this.matched.substr(0, this.matched.length - this.match.length);
        return (past.length > 20 ? '...':'') + past.substr(-20).replace(/\n/g, "");
    },

// displays upcoming input, i.e. for error messages
upcomingInput:function () {
        var next = this.match;
        if (next.length < 20) {
            next += this._input.substr(0, 20-next.length);
        }
        return (next.substr(0,20) + (next.length > 20 ? '...' : '')).replace(/\n/g, "");
    },

// displays the character position where the lexing error occurred, i.e. for error messages
showPosition:function () {
        var pre = this.pastInput();
        var c = new Array(pre.length + 1).join("-");
        return pre + this.upcomingInput() + "\n" + c + "^";
    },

// test the lexed token: return FALSE when not a match, otherwise return token
test_match:function(match, indexed_rule) {
        var token,
            lines,
            backup;

        if (this.options.backtrack_lexer) {
            // save context
            backup = {
                yylineno: this.yylineno,
                yylloc: {
                    first_line: this.yylloc.first_line,
                    last_line: this.last_line,
                    first_column: this.yylloc.first_column,
                    last_column: this.yylloc.last_column
                },
                yytext: this.yytext,
                match: this.match,
                matches: this.matches,
                matched: this.matched,
                yyleng: this.yyleng,
                offset: this.offset,
                _more: this._more,
                _input: this._input,
                yy: this.yy,
                conditionStack: this.conditionStack.slice(0),
                done: this.done
            };
            if (this.options.ranges) {
                backup.yylloc.range = this.yylloc.range.slice(0);
            }
        }

        lines = match[0].match(/(?:\r\n?|\n).*/g);
        if (lines) {
            this.yylineno += lines.length;
        }
        this.yylloc = {
            first_line: this.yylloc.last_line,
            last_line: this.yylineno + 1,
            first_column: this.yylloc.last_column,
            last_column: lines ?
                         lines[lines.length - 1].length - lines[lines.length - 1].match(/\r?\n?/)[0].length :
                         this.yylloc.last_column + match[0].length
        };
        this.yytext += match[0];
        this.match += match[0];
        this.matches = match;
        this.yyleng = this.yytext.length;
        if (this.options.ranges) {
            this.yylloc.range = [this.offset, this.offset += this.yyleng];
        }
        this._more = false;
        this._backtrack = false;
        this._input = this._input.slice(match[0].length);
        this.matched += match[0];
        token = this.performAction.call(this, this.yy, this, indexed_rule, this.conditionStack[this.conditionStack.length - 1]);
        if (this.done && this._input) {
            this.done = false;
        }
        if (token) {
            return token;
        } else if (this._backtrack) {
            // recover context
            for (var k in backup) {
                this[k] = backup[k];
            }
            return false; // rule action called reject() implying the next rule should be tested instead.
        }
        return false;
    },

// return next match in input
next:function () {
        if (this.done) {
            return this.EOF;
        }
        if (!this._input) {
            this.done = true;
        }

        var token,
            match,
            tempMatch,
            index;
        if (!this._more) {
            this.yytext = '';
            this.match = '';
        }
        var rules = this._currentRules();
        for (var i = 0; i < rules.length; i++) {
            tempMatch = this._input.match(this.rules[rules[i]]);
            if (tempMatch && (!match || tempMatch[0].length > match[0].length)) {
                match = tempMatch;
                index = i;
                if (this.options.backtrack_lexer) {
                    token = this.test_match(tempMatch, rules[i]);
                    if (token !== false) {
                        return token;
                    } else if (this._backtrack) {
                        match = false;
                        continue; // rule action called reject() implying a rule MISmatch.
                    } else {
                        // else: this is a lexer rule which consumes input without producing a token (e.g. whitespace)
                        return false;
                    }
                } else if (!this.options.flex) {
                    break;
                }
            }
        }
        if (match) {
            token = this.test_match(match, rules[index]);
            if (token !== false) {
                return token;
            }
            // else: this is a lexer rule which consumes input without producing a token (e.g. whitespace)
            return false;
        }
        if (this._input === "") {
            return this.EOF;
        } else {
            return this.parseError('Lexical error on line ' + (this.yylineno + 1) + '. Unrecognized text.\n' + this.showPosition(), {
                text: "",
                token: null,
                line: this.yylineno
            });
        }
    },

// return next match that has a token
lex:function lex () {
        var r = this.next();
        if (r) {
            return r;
        } else {
            return this.lex();
        }
    },

// activates a new lexer condition state (pushes the new lexer condition state onto the condition stack)
begin:function begin (condition) {
        this.conditionStack.push(condition);
    },

// pop the previously active lexer condition state off the condition stack
popState:function popState () {
        var n = this.conditionStack.length - 1;
        if (n > 0) {
            return this.conditionStack.pop();
        } else {
            return this.conditionStack[0];
        }
    },

// produce the lexer rule set which is active for the currently active lexer condition state
_currentRules:function _currentRules () {
        if (this.conditionStack.length && this.conditionStack[this.conditionStack.length - 1]) {
            return this.conditions[this.conditionStack[this.conditionStack.length - 1]].rules;
        } else {
            return this.conditions["INITIAL"].rules;
        }
    },

// return the currently active lexer condition state; when an index argument is provided it produces the N-th previous condition state, if available
topState:function topState (n) {
        n = this.conditionStack.length - 1 - Math.abs(n || 0);
        if (n >= 0) {
            return this.conditionStack[n];
        } else {
            return "INITIAL";
        }
    },

// alias for begin(condition)
pushState:function pushState (condition) {
        this.begin(condition);
    },

// return the number of states currently on the stack
stateStackSize:function stateStackSize() {
        return this.conditionStack.length;
    },
options: {},
performAction: function anonymous(yy,yy_,$avoiding_name_collisions,YY_START) {
var YYSTATE=YY_START;
switch($avoiding_name_collisions) {
case 0:/* skip */
break;
case 1:return "DECIMAL";
break;
case 2:return "INTEGER";
break;
case 3:return "SQRT";
break;
case 4:return "POW";
break;
case 5:return "INT";
break;
case 6:return "DOUBLE";
break;
case 7:return "WHILE";
break;
case 8:return "PRINTLN";
break;
case 9:return "PLUS";
break;
case 10:return "MINUS";
break;
case 11:return "TIMES";
break;
case 12:return "DIVIDE";
break;
case 13:return "MOD";
break;
case 14:return "COMMA";
break;
case 15:return "GREATER";
break;
case 16:return "LESS";
break;
case 17:return "EQ";
break;
case 18:return "EQEQ";
break;
case 19:return "NEQ";
break;
case 20:return "AND";
break;
case 21:return "OR";
break;
case 22:return "NOT";
break;
case 23:return "LPAREN";
break;
case 24:return "RPAREN";
break;
case 25:return "LBRACE";
break;
case 26:return "RBRACE";
break;
case 27:return "SEMI";
break;
case 28:return "ID";
break;
case 29:return "EOF";
break;
case 30:
                        console.log(`Error lexico ${yy_.yytext}`);
                        return "INVALID";
                    
break;
}
},
rules: [/^(?:((\r|\n|\r\n)|[ \t\f]))/,/^(?:(([0]|[1-9][0-9]*)(\.[0-9]+)))/,/^(?:([0]|[1-9][0-9]*))/,/^(?:(sqrt|SQRT\b))/,/^(?:(pow|POW\b))/,/^(?:(int\b))/,/^(?:(double\b))/,/^(?:(while\b))/,/^(?:(System\.out\.println\b))/,/^(?:(\+))/,/^(?:(-))/,/^(?:(\*))/,/^(?:(\/))/,/^(?:(%))/,/^(?:(,))/,/^(?:(>))/,/^(?:(<))/,/^(?:(=))/,/^(?:(==))/,/^(?:(!=))/,/^(?:(&&))/,/^(?:(or\b))/,/^(?:(!))/,/^(?:(\())/,/^(?:(\)))/,/^(?:(\{))/,/^(?:(\}))/,/^(?:(;))/,/^(?:([a-zA-Z_][a-zA-Z_0-9]*))/,/^(?:$)/,/^(?:.)/],
conditions: {"INITIAL":{"rules":[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],"inclusive":true}}
});
return lexer;
})();
parser.lexer = lexer;
function Parser () {
  this.yy = {};
}
Parser.prototype = parser;parser.Parser = Parser;
return new Parser;
})();


if (typeof require !== 'undefined' && typeof exports !== 'undefined') {
exports.parser = parser;
exports.Parser = parser.Parser;
exports.parse = function () { return parser.parse.apply(parser, arguments); };
exports.main = function commonjsMain (args) {
    if (!args[1]) {
        console.log('Usage: '+args[0]+' FILE');
        process.exit(1);
    }
    var source = require('fs').readFileSync(require('path').normalize(args[1]), "utf8");
    return exports.parser.parse(source);
};
if (typeof module !== 'undefined' && require.main === module) {
  exports.main(process.argv.slice(1));
}
}