# Eksamensnotater 2019
by Sondre Lindaas Gjesdal
## Different types of software development models
* Waterfall
    * Linear production flow, outdated
* Agile development
    * Letting the client side in on the development process. Possible to go back and forth
    * Adaptable to changes
* Kanban
    * Using a Kanban board to get a better overview and make it easier to focus on the task at hans
    * Popular in SCRUM
* SCRUM
    * 2-4 weeks of highly focused sprints focusing on very specific goals
* LEAN
    * Designed for fast delivery & minimum waste

## Waterfall

Waterfall is a linear way of developing and is therefor not particularly iterative and flexible.
The progress flows mostly in one direction through the six stages.

* Requirements
    * Captured in a product requirements document
* Analysis
    * Resulting in models, schema, and business rules
* Design
    * Software architecture
* Coding
    * The development, proving and integration of software
* Testing
    * Systematic discovery and debugging of defects in the software
* Operations
    * the installation, migration, support and maintenance of complete systems

This model is from an 1970 article by [Winston W. Royce](https://en.wikipedia.org/wiki/Winston_W._Royce).

Unmodified waterfall model ![Model](https://upload.wikimedia.org/wikipedia/commons/e/e2/Waterfall_model.svg)

##### Supporting Arguments
The linear development reduces cost at later stages of the development. As there is no need to fix
problems before the end of the development.

Another bonus is the requirements for documentation necessary as well as source code. This makes the loss
of a team member easier to recover from other methods that doesn't have that much emphasis on
documentation and therefor a lot of knowledge lost. The waterfall model provides a structured approach
as the model itself progresses linearly through easy to explain phases and is thus easy to understand.
Because of this it's a first example of software engineering texts and courses.

##### Criticism
Clients might not know exactly what their requirements are before they see a working software and are thus
often changed in the middle of development and towards the end. Leading to redesign and redevelopment.
Something that increases cost.

Designers are not always aware of the difficulties ahead when designing a new feature or product.
Which the can lead to revising of design.

## Fusion

##### Short
The method integrates and extends the best features of earlier OO methods. It's a full
coverage method, providing a direct route from requirements definition through analysis and design
to a programming language implementation. 

![Fusion Process](Pictures/Fusion_Process.jpg)

##### Key attributes for EVO

1. Multiobjective driven
2. Early, frequent iteration
3. Complete analysis, design, build, and test in each step
4. User orientation
6. Systems approach, not merely algorithm orientation
5. Open-ended basic systems architecture
7. Result orientation, not software development process orientation


## RUP

Rational Unified Process divides the development process into four distinct phases that each involve
business modeling, analysis and design, implementation, testing and deployment. RUP development methodology 
provides structured way for companies to envision create software programs. Since it provides a 
specific plan for each step of the development process.

#### Phases
1. Inception
    * Idea for the project is stated. Dev team determines if the project is worth pursuing and what
    resources are needed.
2. Elaboration
    * Project architecture and required resources are further evaluated. Devs consider possible application
    of the software and costs associated with the development.
3. Construction
    * Project is developed and completed. The software is designed, written and tested
4. Transition
    * Software is released to the public Final adjustments and updates are made based on feedback from end 
    users
  
#### Business modelling
* Opprette en bedre forståelse og kommunikasjon mellom forretnings
utviklere og software utviklere.
* Forstå strukturen og dynamikken til forretningen/organisasjonen/interessenten
som skal bruke systemet.
* Finne nåværende problemstillinger og mulige forbedringer.

#### Requirements
* Beskrive hva systemet skal gjøre.
* Lage et Bruksmønster Diagram.

#### Analysis and Design
* Skal vise korleis systemet vil bli realisert i gjennomføringsfasen
* Resultere i eit design og analyse modell.

#### Implementation
* Implementere klasser og objekter i systemet.
* Teste og utvikle komponenter til systemet.
* Sette sammen de ulike delene til et system.

#### Test
* Bekrefte interaksjoner mellom objekter.
* Bekrefte riktig integrasjon av alle komponenter i systemet
* Bekrefte at alle behovene i systemet er implementert riktig.
* Finne og identifisere feil i systemet og korrigere disse før utviklingsfasen

#### Deployment
* Produsere ein produktutgivelse
* Distribuere produktet til interresenter
* Drive support for produktet

#### Configuration and Change Management
* Konfigurasjonsledelse.
* Forandringsforespørsel ledelse.
* Status og mål ledelse.

#### Project Management
* Risiko behandling
* Planlegging av prosjektet.
* Overvåking av prosessens utvikling.

#### Environment
* Beskrive aktivitetene som er nødvending for utviklingsprosessen.
* Forberede prosjekt-spesifikke midler.
* Lage ein utstyrsliste over nødvendig utstyr til prosjektet.

## Agile

#### What's Agile?
Agile is the ability to create and respond to change. It's a way to overcome
an uncertain and turbulent environment. Authors of the Agile Manifesto chose "Agile"
as the label for the idea because the word represented the adaptiveness and response
to change which was so important to their approach.

It's about understanding the your environment today and what uncertainties you're
facing and figure out how to adapt to what's going on.

#### Agile Software Development
Agile is an umbrella term for a set of frameworks and practices
based on the values and principles expressed in the [Agile Manifesto](https://www.agilealliance.org/agile101/the-agile-manifesto/)
and the 12 Principles.

Agile focuses on the people doing the work and how they work together. 
Solutions evolve through collaboration between self-organizing cross-functional teams.

Self-organizing teams is a big focus in Agile development as in they can figure
out how they're going to approach things on their own.
It means the teams are cross-functional. So there is no need for specific
roles. This is because the managers make sure team members have, or obtain, 
the right skill sets. Managers provide the environment that allows the team to 
be successful. 

#### 12 principles

1. Our highest priority is to satisfy the customer through early and continous 
delivery of valuable software.
1. Welcome changing requirements, even late in development. Agile processes 
harness change for the customer's competitive advantage.
1. Deliver working software frequently, from a couple of weeks to a couple of months, with a preference
 to the shorter timescale.
1. Business people and developers must work together daily throughout the project
1. Build projects around motivated individuals. Give them the environment and support
they need, and trust them to get the job done.
1. The mos efficient and effective method of conveying information to and within a development
team is face-to-face conversation.
1. Working software is the primary measure of progress.
1. Agile processes promote sustainable development. The sponsors, developers, 
and users should be able to maintain a constant pace indefinitely.
1. Continuous attention to technical excellence and good design enhances agility.
1. Simplicity -- The art of maximizing the amount of work done -- is essential
1. The best architectures, requirements, and designs emerge from self-organizing teams.
1. At regular intervals, the team reflects on how to become more effective,
then tunes and adjusts its behavior accordingly.

## UML

Unified Modeling Language is a standardized general-purpose modeling language in the field of OO software engineering.
 