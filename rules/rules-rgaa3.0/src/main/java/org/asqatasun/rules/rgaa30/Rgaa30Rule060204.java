/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2015  Asqatasun.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */
package org.asqatasun.rules.rgaa30;

import org.asqatasun.ruleimplementation.AbstractPageRuleWithSelectorAndCheckerImplementation;
import org.asqatasun.rules.elementchecker.link.LinkTitlePertinenceChecker;
import org.asqatasun.rules.elementselector.CompositeLinkElementSelector;

/**
 * Implementation of the rule 6.2.4 of the referential Rgaa 3.0.
 * <br/>
 * For more details about the implementation, refer to <a href="http://doc.asqatasun.org/en/40_Rules/rgaa3.0/06.Links/Rule-6-2-4.html">the rule 6.2.4 design page.</a>
 * @see <a href="http://references.modernisation.gouv.fr/referentiel-technique-0#test-6-2-4"> 6.2.4 rule specification</a>
 *
 */
public class Rgaa30Rule060204 extends AbstractPageRuleWithSelectorAndCheckerImplementation {

    /**
     * Default constructor
     */
    public Rgaa30Rule060204 () {
        super(new CompositeLinkElementSelector(false, false), new LinkTitlePertinenceChecker());
    }
}
