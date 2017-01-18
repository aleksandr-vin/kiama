/*
 * This file is part of Kiama.
 *
 * Copyright (C) 2017 Anthony M Sloane, Macquarie University.
 *
 * Kiama is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Kiama is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Kiama.  (See files COPYING and COPYING.LESSER.)  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.bitbucket.inkytonik.kiama
package example.prolog

import org.bitbucket.inkytonik.kiama.util.TestREPLWithConfig

/**
 * Tests that check that the REPL produces appropriate output.
 */
class PrologREPLTests extends PrologDriver with TestREPLWithConfig[PrologConfig] {

    val path = "example/prolog/tests"
    filetests("Prolog REPL", path, ".repl", ".replout",
        argslist = List(List(
            "--database",
            "src/test/scala/org/bitbucket/inkytonik/kiama/example/prolog/tests/family.pl"
        )))

}
