package com.mokoresourcestest

import dev.icerock.moko.resources.desc.*
import resources.generated.MR

internal actual class LocalizationCompanion {

    // VARIOUS
    actual fun agree(): String {
        return StringDesc.Resource(MR.strings.agree).localized()
    }

    actual fun accept(): String {
        return StringDesc.Resource(MR.strings.accept).localized()
    }

    actual fun attention(): String {
        return StringDesc.Resource(MR.strings.attention).localized()
    }

    actual fun cancel(): String {
        return StringDesc.Resource(MR.strings.cancel).localized()
    }

    actual fun close(): String {
        return StringDesc.Resource(MR.strings.close).localized()
    }

    actual fun `continue`(): String {
        return StringDesc.Resource(MR.strings.continueMy).localized()
    }

    actual fun done(): String {
        return StringDesc.Resource(MR.strings.done).localized()
    }

    actual fun dots(): String {
        return StringDesc.Resource(MR.strings.dots).localized()
    }

    actual fun edit(): String {
        return StringDesc.Resource(MR.strings.edit).localized()
    }

    actual fun end(): String {
        return StringDesc.Resource(MR.strings.end).localized()
    }

    actual fun exit(): String {
        return StringDesc.Resource(MR.strings.exit).localized()
    }

    actual fun later(): String {
        return StringDesc.Resource(MR.strings.later).localized()
    }

    actual fun loading(): String {
        return StringDesc.Resource(MR.strings.loading).localized()
    }

    actual fun more(): String {
        return StringDesc.Resource(MR.strings.more).localized()
    }

    actual fun next(): String {
        return StringDesc.Resource(MR.strings.next).localized()
    }

    actual fun no(): String {
        return StringDesc.Resource(MR.strings.no).localized()
    }

    actual fun ok(): String {
        return StringDesc.Resource(MR.strings.ok).localized()
    }

    actual fun show(): String {
        return StringDesc.Resource(MR.strings.show).localized()
    }

    actual fun success(): String {
        return StringDesc.Resource(MR.strings.success).localized()
    }

    actual fun synchronize(): String {
        return StringDesc.Resource(MR.strings.synchronize).localized()
    }

    actual fun tryAgain(): String {
        return StringDesc.Resource(MR.strings.tryAgain).localized()
    }

    actual fun version(): String {
        return StringDesc.Resource(MR.strings.version).localized()
    }

    actual fun yes(): String {
        return StringDesc.Resource(MR.strings.yes).localized()
    }

    actual fun imprint(): String {
        return StringDesc.Resource(MR.strings.imprint).localized()
    }

    actual fun licenses(): String {
        return StringDesc.Resource(MR.strings.licenses).localized()
    }

    actual fun privacyPolicy(): String {
        return StringDesc.Resource(MR.strings.privacyPolicy).localized()
    }

    actual fun teamsAndConditions(): String {
        return StringDesc.Resource(MR.strings.teamsAndConditions).localized()
    }

    // time
    actual fun days(count: Int): String {
        return (StringDesc.Plural(MR.plurals.solveMcMissingAnswers, count) as StringDesc).localized()
        return (StringDesc.Plural(MR.plurals.days, count)as StringDesc).localized()
    }

    actual fun hours(count: Int): String {
        return (StringDesc.Plural(MR.plurals.hours, count)as StringDesc).localized()
    }

    actual fun minutes(count: Int): String {
        return (StringDesc.Plural(MR.plurals.minutes, count)as StringDesc).localized()
    }

    actual fun seconds(count: Int): String {
        return (StringDesc.Plural(MR.plurals.seconds, count)as StringDesc).localized()
    }

    actual fun timeRemaining(): String {
        return StringDesc.Resource(MR.strings.timeRemaining).localized()
    }

    actual fun timeCountdownTitle(): String {
        return StringDesc.Resource(MR.strings.timeCountdownTitle).localized()
    }

    // person
    actual fun city(): String {
        return StringDesc.Resource(MR.strings.city).localized()
    }

    actual fun female(): String {
        return StringDesc.Resource(MR.strings.female).localized()
    }

    actual fun firstname(): String {
        return StringDesc.Resource(MR.strings.firstname).localized()
    }

    actual fun gender(): String {
        return StringDesc.Resource(MR.strings.gender).localized()
    }

    actual fun lastname(): String {
        return StringDesc.Resource(MR.strings.lastname).localized()
    }

    actual fun male(): String {
        return StringDesc.Resource(MR.strings.male).localized()
    }

    actual fun number(): String {
        return StringDesc.Resource(MR.strings.number).localized()
    }

    actual fun street(): String {
        return StringDesc.Resource(MR.strings.street).localized()
    }

    actual fun zipcode(): String {
        return StringDesc.Resource(MR.strings.zipcode).localized()
    }

    // register
    actual fun registerTitle(): String {
        return StringDesc.Resource(MR.strings.registerTitle).localized()
    }

    actual fun registerBtn(): String {
        return StringDesc.Resource(MR.strings.registerBtn).localized()
    }

    actual fun registerMessage(): String {
        return StringDesc.Resource(MR.strings.registerMessage).localized()
    }

    actual fun registerUsername(): String {
        return StringDesc.Resource(MR.strings.registerUsername).localized()
    }

    actual fun registerEmail(): String {
        return StringDesc.Resource(MR.strings.registerEmail).localized()
    }

    actual fun registerPassword(): String {
        return StringDesc.Resource(MR.strings.registerPassword).localized()
    }

    actual fun registerPasswordConfirm(): String {
        return StringDesc.Resource(MR.strings.registerPasswordConfirm).localized()
    }

    actual fun registerAccept(): String {
        return StringDesc.Resource(MR.strings.registerAccept).localized()
    }

    actual fun registerAcceptContinue(): String {
        return StringDesc.Resource(MR.strings.registerAcceptContinue).localized()
    }

    actual fun registerAcceptGTC(): String {
        return StringDesc.Resource(MR.strings.registerAcceptGTC).localized()
    }

    actual fun registerAcceptPP(): String {
        return StringDesc.Resource(MR.strings.registerAcceptPP).localized()
    }

    actual fun registerGTC(): String {
        return StringDesc.Resource(MR.strings.registerGTC).localized()
    }

    actual fun registerPP(): String {
        return StringDesc.Resource(MR.strings.registerPP).localized()
    }

    actual fun registerMemberNumber(): String {
        return StringDesc.Resource(MR.strings.registerMemberNumber).localized()
    }

    actual fun registerMsgOk(): String {
        return StringDesc.Resource(MR.strings.registerMsgOk).localized()
    }

    // demo user dialog
    actual fun demoAlreadyUsed(): String {
        return StringDesc.Resource(MR.strings.demoAlreadyUsed).localized()
    }

    actual fun demoAlreadyUsedDelete(): String {
        return StringDesc.Resource(MR.strings.demoAlreadyUsedDelete).localized()
    }

    actual fun demoQuestion(): String {
        return StringDesc.Resource(MR.strings.demoQuestion).localized()
    }

    actual fun demoQuestionRetry(): String {
        return StringDesc.Resource(MR.strings.demoQuestionRetry).localized()
    }

    actual fun demoLoginUnauthorizedEvent(): String {
        return StringDesc.ResourceFormatted(MR.strings.demoLoginUnauthorizedEvent, LocalizationManager.eventInLine(1)).localized()
    }

    // login
    actual fun loginTitle(): String {
        return StringDesc.Resource(MR.strings.loginTitle).localized()
    }

    actual fun login(): String {
        return StringDesc.Resource(MR.strings.login).localized()
    }

    actual fun loginMessage(): String {
        return StringDesc.Resource(MR.strings.loginMessage).localized()
    }

    actual fun loginEmail(): String {
        return StringDesc.Resource(MR.strings.loginEmail).localized()
    }

    actual fun loginPassword(): String {
        return StringDesc.Resource(MR.strings.loginPassword).localized()
    }

    actual fun loginWithoutRegistration(): String {
        return StringDesc.Resource(MR.strings.loginWithoutRegistration).localized()
    }

    // forgot password
    actual fun forgotPwRequest(): String {
        return StringDesc.Resource(MR.strings.forgotPwRequest).localized()
    }

    actual fun forgotPwMessage(): String {
        return StringDesc.Resource(MR.strings.forgotPwMessage).localized()
    }

    actual fun forgotPwAnswer(): String {
        return StringDesc.Resource(MR.strings.forgotPwAnswer).localized()
    }


    // EVENTS
    actual fun event(count: Int): String {
        return (StringDesc.Plural(MR.plurals.event, count)as StringDesc).localized()
    }

    actual fun eventInLine(count: Int): String {
        return (StringDesc.Plural(MR.plurals.eventInLine, count)as StringDesc).localized()
    }

    actual fun eventInLineWith(): String {
        return StringDesc.Resource(MR.strings.eventInLineWith).localized()
    }

    actual fun eventList(): String {
        return StringDesc.Resource(MR.strings.eventList).localized()
    }

    actual fun eventListInLine(): String {
        return StringDesc.Resource(MR.strings.eventListInLine).localized()
    }

    actual fun eventNew(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventNew, LocalizationManager.eventInLine(1)).localized()
    }

    // EASY EVENT AND EVENT LIST
    actual fun easyEventMessage(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventMessage, LocalizationManager.eventInLineWith(), LocalizationManager.eventListInLine()).localized()
    }

    actual fun easyEventContinue(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventContinue, LocalizationManager.eventInLine(1)).localized()
    }

    actual fun easyEventAlternative(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventAlternative, LocalizationManager.eventInLineWith()).localized()
    }

    actual fun eventsActive(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsActive, LocalizationManager.eventInLine(2)).localized()
    }

    actual fun eventsExpired(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsExpired, LocalizationManager.eventInLine(2)).localized()
    }

    actual fun eventsMy(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsMy, LocalizationManager.eventInLine(2)).localized()
    }

    actual fun eventsPublic(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsPublic, LocalizationManager.eventInLine(2)).localized()
    }

    actual fun eventsPremium(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsPremium, LocalizationManager.eventInLine(2)).localized()
    }

    actual fun eventsTimeLeft(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsTimeLeft, LocalizationManager.event(1)).localized()
    }

    actual fun eventsFree(): String {
        return StringDesc.Resource(MR.strings.eventsFree).localized()
    }

    actual fun eventChanged(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventChanged, LocalizationManager.event(1)).localized()
    }

    // WelcomeDialog
    actual fun welcomeTeamTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamTitle).localized()
    }

    actual fun welcomeTeamMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamMessage).localized()
    }

    actual fun welcomeTeamPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamPlaceholder).localized()
    }

    actual fun welcomeTeamError(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamError).localized()
    }

    actual fun welcomeParticipantsTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsTitle).localized()
    }

    actual fun welcomeParticipantsMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsMessage).localized()
    }

    actual fun welcomeParticipantsPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsPlaceholder).localized()
    }

    actual fun welcomeParticipantsError(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsError).localized()
    }

    actual fun welcomeEmailTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailTitle).localized()
    }

    actual fun welcomeEmailMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailMessage).localized()
    }

    actual fun welcomeEmailPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailPlaceholder).localized()
    }

    actual fun welcomeEmailError(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailError).localized()
    }

    actual fun welcomeDone(): String {
        return StringDesc.Resource(MR.strings.welcomeDone).localized()
    }

    // MENU
    actual fun menuBriefing(): String {
        return StringDesc.Resource(MR.strings.menuBriefing).localized()
    }

    actual fun menuChat(): String {
        return StringDesc.Resource(MR.strings.menuChat).localized()
    }

    actual fun menuChatNewRoom(): String {
        return StringDesc.Resource(MR.strings.menuChatNewRoom).localized()
    }

    actual fun menuChatEditRoom(): String {
        return StringDesc.Resource(MR.strings.menuChatEditRoom).localized()
    }

    actual fun menuEmergency(): String {
        return StringDesc.Resource(MR.strings.menuEmergency).localized()
    }

    actual fun menuHighScore(): String {
        return StringDesc.Resource(MR.strings.menuHighScore).localized()
    }

    actual fun menuLogin(): String {
        return StringDesc.Resource(MR.strings.menuLogin).localized()
    }

    actual fun menuMap(): String {
        return StringDesc.Resource(MR.strings.menuMap).localized()
    }

    actual fun menuOpCall(): String {
        return StringDesc.Resource(MR.strings.menuOpCall).localized()
    }

    actual fun menuProfile(): String {
        return StringDesc.Resource(MR.strings.menuProfile).localized()
    }

    actual fun menuStatistics(): String {
        return StringDesc.Resource(MR.strings.menuStatistics).localized()
    }

    actual fun menuTask(): String {
        return StringDesc.Resource(MR.strings.menuTask).localized()
    }

    actual fun menuTaskList(): String {
        return StringDesc.Resource(MR.strings.menuTaskList).localized()
    }

    actual fun menuTutorial(): String {
        return StringDesc.Resource(MR.strings.menuTutorial).localized()
    }

    actual fun menuPhoto(): String {
        return StringDesc.Resource(MR.strings.menuPhoto).localized()
    }

    actual fun menuQR(): String {
        return StringDesc.Resource(MR.strings.menuQR).localized()
    }

    actual fun menuAR(): String {
        return StringDesc.Resource(MR.strings.menuAR).localized()
    }

    actual fun menuPassword(): String {
        return StringDesc.Resource(MR.strings.menuPassword).localized()
    }

    // DEMO
    actual fun gameInfo(): String {
        return StringDesc.Resource(MR.strings.gameInfo).localized()
    }

    actual fun demoTitle(): String {
        return StringDesc.Resource(MR.strings.demoTitle).localized()
    }

    actual fun demoMessage(): String {
        return StringDesc.Resource(MR.strings.demoMessage).localized()
    }

    // SPECIAL
    actual fun dialogExitReally(): String {
        return StringDesc.Resource(MR.strings.dialogExitReally).localized()
    }

    actual fun dialogNewEventMessage(count: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.dialogNewEventMessage, count, LocalizationManager.eventInLine(1)).localized()
    }

    actual fun dialogNoMagnetSensorMessage(): String {
        return StringDesc.Resource(MR.strings.dialogNoMagnetSensorMessage).localized()
    }

    actual fun dialogNoMagnetSensorTitle(): String {
        return StringDesc.Resource(MR.strings.dialogNoMagnetSensorTitle).localized()
    }

    // GPS
    actual fun gpsContinue(): String {
        return StringDesc.Resource(MR.strings.gpsContinue).localized()
    }

    actual fun gpsEnable(): String {
        return StringDesc.Resource(MR.strings.gpsEnable).localized()
    }

    actual fun gpsNoSignal(): String {
        return StringDesc.Resource(MR.strings.gpsNoSignal).localized()
    }

    actual fun gpsNotEnabled(): String {
        return StringDesc.Resource(MR.strings.gpsNotEnabled).localized()
    }

    // TASK and TASK LIST
    actual fun task(): String {
        return StringDesc.Resource(MR.strings.task).localized()
    }

    actual fun taskDistance(): String {
        return StringDesc.Resource(MR.strings.taskDistance).localized()
    }

    actual fun taskName(): String {
        return StringDesc.Resource(MR.strings.taskName).localized()
    }

    actual fun taskNr(): String {
        return StringDesc.Resource(MR.strings.taskNr).localized()
    }

    actual fun taskPoints(): String {
        return StringDesc.Resource(MR.strings.taskPoints).localized()
    }

    actual fun taskTabSpot(nr: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskTabSpot, LocalizationManager.taskTaskName(), nr).localized()
    }

    actual fun taskTaskName(): String {
        return StringDesc.Resource(MR.strings.taskTaskName).localized()
    }

    actual fun taskTime(): String {
        return StringDesc.Resource(MR.strings.taskTime).localized()
    }

    actual fun taskType(): String {
        return StringDesc.Resource(MR.strings.taskType).localized()
    }

    // QUEST DETAILS
    actual fun taskActive(): String {
        return StringDesc.ResourceFormatted(MR.strings.taskActive, LocalizationManager.taskTaskName()).localized()
    }

    actual fun taskActiveVoting(): String {
        return StringDesc.Resource(MR.strings.taskActiveVoting).localized()
    }

    actual fun taskCheckin(): String {
        return StringDesc.Resource(MR.strings.taskCheckin).localized()
    }

    actual fun taskDetail(): String {
        return StringDesc.Resource(MR.strings.taskDetail).localized()
    }

    actual fun taskSolution(): String {
        return StringDesc.Resource(MR.strings.taskSolution).localized()
    }

    actual fun taskEventNotActive(): String {
        return StringDesc.Resource(MR.strings.taskEventNotActive).localized()
    }

    actual fun taskFailed(): String {
        return StringDesc.Resource(MR.strings.taskFailed).localized()
    }

    actual fun taskInactive(): String {
        return StringDesc.Resource(MR.strings.taskInactive).localized()
    }

    actual fun taskNotInRange(distance: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskNotInRange, distance).localized()
    }

    actual fun taskPass(): String {
        return StringDesc.Resource(MR.strings.taskPass).localized()
    }

    actual fun taskPassed(): String {
        return StringDesc.Resource(MR.strings.taskPassed).localized()
    }

    actual fun taskPictures(): String {
        return StringDesc.Resource(MR.strings.taskPictures).localized()
    }

    actual fun taskSolve(): String {
        return StringDesc.ResourceFormatted(MR.strings.taskSolve, LocalizationManager.taskTaskName()).localized()
    }

    actual fun taskSolveVoting(): String {
        return StringDesc.Resource(MR.strings.taskSolveVoting).localized()
    }

    actual fun taskSolved(): String {
        return StringDesc.Resource(MR.strings.taskSolved).localized()
    }

    actual fun taskSolvedVoting(): String {
        return StringDesc.Resource(MR.strings.taskSolvedVoting).localized()
    }

    actual fun taskTooFar(distance: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskTooFar, distance).localized()
    }

    // Password Dialog
    actual fun passwordEnter(): String {
        return StringDesc.Resource(MR.strings.passwordEnter).localized()
    }

    actual fun passwordWrong(): String {
        return StringDesc.Resource(MR.strings.passwordWrong).localized()
    }

    // SOLUTION Dialog
    actual fun solveCorrectSolution(): String {
        return StringDesc.Resource(MR.strings.solveCorrectSolution).localized()
    }

    actual fun solveCorrectVoting(): String {
        return StringDesc.Resource(MR.strings.solveCorrectVoting).localized()
    }

    actual fun solveMcEmpty(): String {
        return StringDesc.Resource(MR.strings.solveMcEmpty).localized()
    }

    actual fun solveMcFull(maxAnswers: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveMcFull, maxAnswers, maxAnswers)as StringDesc).localized()
    }

    actual fun solveMcMissingAnswers(missing: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveMcMissingAnswers, missing, missing)as StringDesc).localized()
    }

    actual fun solveMcMissingAnswerExact(): String {
        return StringDesc.Resource(MR.strings.solveMcMissingAnswerExact).localized()
    }

    actual fun solveTextEmpty(): String {
        return StringDesc.Resource(MR.strings.solveTextEmpty).localized()
    }

    actual fun solveTextEmptyVoting(): String {
        return StringDesc.Resource(MR.strings.solveTextEmptyVoting).localized()
    }

    actual fun solveTitle(): String {
        return StringDesc.Resource(MR.strings.solveTitle).localized()
    }

    actual fun solveVotingEmptyDialog(): String {
        return StringDesc.Resource(MR.strings.solveVotingEmptyDialog).localized()
    }

    actual fun solveVotingMissingMinVote(maxVotes: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveVotingMissingMinVote, maxVotes, maxVotes)as StringDesc).localized()
    }

    actual fun solveVotingMissingStars(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveVotingMissingStars, count, count)as StringDesc).localized()
    }

    actual fun solveVotingMissingVotes(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveVotingMissingVotes, count, count)as StringDesc).localized()
    }

    actual fun solveVotingStarsFull(maxVotes: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveVotingStarsFull, maxVotes, maxVotes)as StringDesc).localized()
    }

    actual fun solveVotingVotesFull(maxVotes: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.solveVotingVotesFull, maxVotes, maxVotes)as StringDesc).localized()
    }

    actual fun solveWrongSolution(): String {
        return StringDesc.Resource(MR.strings.solveWrongSolution).localized()
    }

    // SOLVE CONTROLLER
    actual fun correctWas(): String {
        return StringDesc.Resource(MR.strings.correctWas).localized()
    }

    actual fun correctWasMedia(): String {
        return StringDesc.Resource(MR.strings.correctWasMedia).localized()
    }

    actual fun triesLeft(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.triesLeft, count, count)as StringDesc).localized()
    }

    actual fun triesLeftMany(): String {
        return StringDesc.Resource(MR.strings.triesLeftMany).localized()
    }

    // QR CODE
    actual fun qrAnotherQr(): String {
        return StringDesc.Resource(MR.strings.qrAnotherQr).localized()
    }

    actual fun qrTaskNotFound(): String {
        return StringDesc.ResourceFormatted(MR.strings.qrTaskNotFound, LocalizationManager.taskTaskName()).localized()
    }

    // AR
    actual fun arDidNotFinishLoading(progress: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.arDidNotFinishLoading, progress).localized()
    }

    // STATS
    actual fun statsTeam(): String {
        return StringDesc.Resource(MR.strings.statsTeam).localized()
    }

    actual fun statsTeamName(): String {
        return StringDesc.Resource(MR.strings.statsTeamName).localized()
    }

    actual fun statsRank(): String {
        return StringDesc.Resource(MR.strings.statsRank).localized()
    }

    actual fun statsSolved(): String {
        return StringDesc.Resource(MR.strings.statsSolved).localized()
    }

    actual fun statsNotSolved(): String {
        return StringDesc.Resource(MR.strings.statsNotSolved).localized()
    }

    actual fun statsAverage(): String {
        return StringDesc.Resource(MR.strings.statsAverage).localized()
    }

    actual fun statsProgress(): String {
        return StringDesc.Resource(MR.strings.statsProgress).localized()
    }

    actual fun statsUnfinished(): String {
        return StringDesc.Resource(MR.strings.statsUnfinished).localized()
    }

    // STATISTIC
    actual fun statisticCompare(): String {
        return StringDesc.Resource(MR.strings.statisticCompare).localized()
    }

    actual fun statisticMyTeam(): String {
        return StringDesc.Resource(MR.strings.statisticMyTeam).localized()
    }

    actual fun statisticOtherTeam(): String {
        return StringDesc.Resource(MR.strings.statisticOtherTeam).localized()
    }

    actual fun statisticDistance(): String {
        return StringDesc.Resource(MR.strings.statisticDistance).localized()
    }

    actual fun statisticOpen(): String {
        return StringDesc.Resource(MR.strings.statisticOpen).localized()
    }

    actual fun statisticNoData(): String {
        return StringDesc.Resource(MR.strings.statisticNoData).localized()
    }

    actual fun statisticNoHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticNoHighScore).localized()
    }

    actual fun statisticNoStatistic(): String {
        return StringDesc.Resource(MR.strings.statisticNoStatistic).localized()
    }

    actual fun statisticNotInHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticNotInHighScore).localized()
    }

    actual fun statisticTeamNotInHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticTeamNotInHighScore).localized()
    }

    // OPERATOR
    actual fun `operator`(): String {
        return StringDesc.Resource(MR.strings.operator).localized()
    }

    actual fun operatorSend(): String {
        return StringDesc.Resource(MR.strings.operatorSend).localized()
    }

    actual fun operatorMe(): String {
        return StringDesc.Resource(MR.strings.operatorMe).localized()
    }

    actual fun operatorTitle(): String {
        return StringDesc.Resource(MR.strings.operatorTitle).localized()
    }

    actual fun operatorIsSending(): String {
        return StringDesc.Resource(MR.strings.operatorIsSending).localized()
    }

    // CHAT
    actual fun chatActivated(): String {
        return StringDesc.Resource(MR.strings.chatActivated).localized()
    }

    actual fun chatActivatedLocal(): String {
        return StringDesc.Resource(MR.strings.chatActivatedLocal).localized()
    }

    actual fun chatAddChatroom(): String {
        return StringDesc.Resource(MR.strings.chatAddChatroom).localized()
    }

    actual fun chatAddChatroomAlreadyExists(): String {
        return StringDesc.Resource(MR.strings.chatAddChatroomAlreadyExists).localized()
    }

    actual fun chatAddName(): String {
        return StringDesc.Resource(MR.strings.chatAddName).localized()
    }

    actual fun chatAddRoomSelect(): String {
        return StringDesc.Resource(MR.strings.chatAddRoomSelect).localized()
    }

    actual fun chatAddSelect(): String {
        return StringDesc.Resource(MR.strings.chatAddSelect).localized()
    }

    actual fun chatConnecting(): String {
        return StringDesc.Resource(MR.strings.chatConnecting).localized()
    }

    actual fun chatCreate(): String {
        return StringDesc.Resource(MR.strings.chatCreate).localized()
    }

    actual fun chatDeactivated(): String {
        return StringDesc.Resource(MR.strings.chatDeactivated).localized()
    }

    actual fun chatDeactivatedLocal(): String {
        return StringDesc.Resource(MR.strings.chatDeactivatedLocal).localized()
    }

    actual fun chatDeactivatedText(): String {
        return StringDesc.Resource(MR.strings.chatDeactivatedText).localized()
    }

    actual fun chatEmpty(): String {
        return StringDesc.Resource(MR.strings.chatEmpty).localized()
    }

    actual fun chatEmptyDeactivated(): String {
        return StringDesc.Resource(MR.strings.chatEmptyDeactivated).localized()
    }

    actual fun chatLeave(): String {
        return StringDesc.Resource(MR.strings.chatLeave).localized()
    }

    actual fun chatLeaveSure(): String {
        return StringDesc.Resource(MR.strings.chatLeaveSure).localized()
    }

    actual fun chatNewMessage(): String {
        return StringDesc.Resource(MR.strings.chatNewMessage).localized()
    }

    actual fun chatRemoveChatroom(): String {
        return StringDesc.Resource(MR.strings.chatRemoveChatroom).localized()
    }

    actual fun chatRoomName(): String {
        return StringDesc.Resource(MR.strings.chatRoomName).localized()
    }

    actual fun chatUserAdded(): String {
        return StringDesc.Resource(MR.strings.chatUserAdded).localized()
    }

    actual fun chatUserAddedLocal(): String {
        return StringDesc.Resource(MR.strings.chatUserAddedLocal).localized()
    }

    actual fun chatUserLeft(): String {
        return StringDesc.Resource(MR.strings.chatUserLeft).localized()
    }

    actual fun chatUserLeftLocal(): String {
        return StringDesc.Resource(MR.strings.chatUserLeftLocal).localized()
    }

    // PhotoUpload
    actual fun photoUploadError(): String {
        return StringDesc.Resource(MR.strings.photoUploadError).localized()
    }

    actual fun photoUploadSuccessful(): String {
        return StringDesc.Resource(MR.strings.photoUploadSuccessful).localized()
    }

    actual fun photoUploadSuccessfulGallery(): String {
        return StringDesc.Resource(MR.strings.photoUploadSuccessfulGallery).localized()
    }

    // VideoUpload
    actual fun videoUploadError(): String {
        return StringDesc.Resource(MR.strings.videoUploadError).localized()
    }

    actual fun videoUploadSuccessful(): String {
        return StringDesc.Resource(MR.strings.videoUploadSuccessful).localized()
    }

    // SETTINGS
    actual fun settingsMoreEvents(): String {
        return StringDesc.ResourceFormatted(MR.strings.settingsMoreEvents, LocalizationManager.event(2)).localized()
    }

    actual fun settingsPackAndGo(): String {
        return StringDesc.Resource(MR.strings.settingsPackAndGo).localized()
    }

    actual fun settingsLanguage(): String {
        return StringDesc.Resource(MR.strings.settingsLanguage).localized()
    }

    actual fun settingsDeviceInformation(): String {
        return StringDesc.Resource(MR.strings.settingsDeviceInformation).localized()
    }

    actual fun settingsLogout(): String {
        return StringDesc.Resource(MR.strings.settingsLogout).localized()
    }

    actual fun settingsNotSynchronized(): String {
        return StringDesc.Resource(MR.strings.settingsNotSynchronized).localized()
    }

    actual fun synchronizeAll(): String {
        return StringDesc.Resource(MR.strings.synchronizeAll).localized()
    }

    actual fun synchronizeAuthenticate(): String {
        return StringDesc.Resource(MR.strings.synchronizeAuthenticate).localized()
    }

    actual fun synchronizeChat(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.synchronizeChat, count, count)as StringDesc).localized()
    }

    actual fun synchronizeMedia(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.synchronizeMedia, count, count)as StringDesc).localized()
    }

    actual fun synchronizeSolutions(count: Int): String {
        return (StringDesc.PluralFormatted(MR.plurals.synchronizeSolutions, count, count)as StringDesc).localized()
    }

    actual fun synchronizeTitle(): String {
        return StringDesc.Resource(MR.strings.synchronizeTitle).localized()
    }

    // LANGUAGES
    actual fun langEN(): String {
        return StringDesc.Resource(MR.strings.langEN).localized()
    }

    actual fun langDE(): String {
        return StringDesc.Resource(MR.strings.langDE).localized()
    }

    actual fun langBG(): String {
        return StringDesc.Resource(MR.strings.langBG).localized()
    }

    actual fun langCZ(): String {
        return StringDesc.Resource(MR.strings.langCZ).localized()
    }

    actual fun langDA(): String {
        return StringDesc.Resource(MR.strings.langDA).localized()
    }

    actual fun langES(): String {
        return StringDesc.Resource(MR.strings.langES).localized()
    }

    actual fun langFR(): String {
        return StringDesc.Resource(MR.strings.langFR).localized()
    }

    actual fun langHE(): String {
        return StringDesc.Resource(MR.strings.langHE).localized()
    }

    actual fun langHU(): String {
        return StringDesc.Resource(MR.strings.langHU).localized()
    }

    actual fun langIT(): String {
        return StringDesc.Resource(MR.strings.langIT).localized()
    }

    actual fun langNL(): String {
        return StringDesc.Resource(MR.strings.langNL).localized()
    }

    actual fun langNotAvailable(): String {
        return StringDesc.Resource(MR.strings.langNotAvailable).localized()
    }

    // DEVICE INFORMATION
    actual fun deviceSystemVersion(): String {
        return StringDesc.Resource(MR.strings.deviceSystemVersion).localized()
    }

    actual fun deviceAppVersion(): String {
        return StringDesc.Resource(MR.strings.deviceAppVersion).localized()
    }

    actual fun deviceSynchronisation(): String {
        return StringDesc.Resource(MR.strings.deviceSynchronisation).localized()
    }

    actual fun deviceUnsend(): String {
        return StringDesc.Resource(MR.strings.deviceUnsend).localized()
    }

    actual fun deviceUnsendResults(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendResults).localized()
    }

    actual fun deviceUnsendMedia(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendMedia).localized()
    }

    actual fun deviceUnsendChat(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendChat).localized()
    }

    // USECASES
    actual fun loadMessageGetEventBranding(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventBranding).localized()
    }

    actual fun loadMessageGetEventCoins(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventCoins).localized()
    }

    actual fun loadMessageGetEventFiles(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventFiles).localized()
    }

    actual fun loadMessageGetEventOffline(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventOffline).localized()
    }

    actual fun loadMessageGetPlayerEvents(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayerEvents).localized()
    }

    actual fun loadMessageGetPlayer(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayer).localized()
    }

    actual fun loadMessageGetPlayerInfo(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayerInfo).localized()
    }

    actual fun loadMessageLogin(): String {
        return StringDesc.Resource(MR.strings.loadMessageLogin).localized()
    }

    actual fun loadMessageRegister(): String {
        return StringDesc.Resource(MR.strings.loadMessageRegister).localized()
    }

    actual fun loadMessageRequestPasswordReset(): String {
        return StringDesc.Resource(MR.strings.loadMessageRequestPasswordReset).localized()
    }

    actual fun loadMessageUpdateUser(): String {
        return StringDesc.Resource(MR.strings.loadMessageUpdateUser).localized()
    }

    actual fun loadMessageGetTasks(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetTasks).localized()
    }

    actual fun loadMessageCheckInTask(): String {
        return StringDesc.Resource(MR.strings.loadMessageCheckInTask).localized()
    }

    actual fun loadMessageMediaGet(): String {
        return StringDesc.Resource(MR.strings.loadMessageMediaGet).localized()
    }

    actual fun loadMessageSolve(): String {
        return StringDesc.Resource(MR.strings.loadMessageSolve).localized()
    }

    actual fun loadMessageGetHighScore(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetHighScore).localized()
    }

    actual fun loadMessageReadNewEvent(): String {
        return StringDesc.Resource(MR.strings.loadMessageReadNewEvent).localized()
    }

    actual fun loadMessageMediaUpload(): String {
        return StringDesc.Resource(MR.strings.loadMessageMediaUpload).localized()
    }

    actual fun loadMessageSetTeamEmail(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamEmail).localized()
    }

    actual fun loadMessageSetTeamName(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamName).localized()
    }

    actual fun loadMessageSetTeamParticipants(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamParticipants).localized()
    }

    actual fun loadMessageSetTeamPhoto(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamPhoto).localized()
    }

    actual fun loadMessageUnpacking(): String {
        return StringDesc.Resource(MR.strings.loadMessageUnpacking).localized()
    }

    actual fun loadMessageUploadImage(): String {
        return StringDesc.Resource(MR.strings.loadMessageUploadImage).localized()
    }

    actual fun loadMessageUploadVideo(): String {
        return StringDesc.Resource(MR.strings.loadMessageUploadVideo).localized()
    }

    // JSON Response error (codes), lookup using "error_code_"+errorCode
    actual fun anErrorOccurred(): String {
        return StringDesc.Resource(MR.strings.anErrorOccurred).localized()
    }

    actual fun errorAlertConnectionProblems(): String {
        return StringDesc.Resource(MR.strings.errorAlertConnectionProblems).localized()
    }

    actual fun errorAlertNoWritableSdcard(): String {
        return StringDesc.Resource(MR.strings.errorAlertNoWritableSdcard).localized()
    }

    actual fun errorCodeAlreadyExists(): String {
        return StringDesc.Resource(MR.strings.errorCodeAlreadyExists).localized()
    }

    actual fun errorCodeCantPlayAgain(): String {
        return StringDesc.Resource(MR.strings.errorCodeCantPlayAgain).localized()
    }

    actual fun errorCodeCombatSpotAlreadySolvedTitle(): String {
        return StringDesc.Resource(MR.strings.errorCodeCombatSpotAlreadySolvedTitle).localized()
    }

    actual fun errorCodeCombatSpotAlreadySolved(): String {
        return StringDesc.Resource(MR.strings.errorCodeCombatSpotAlreadySolved).localized()
    }

    actual fun errorCodeEmailAddressDotAtom(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressDotAtom).localized()
    }

    actual fun errorCodeEmailAddressInvalidFormat(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidFormat).localized()
    }

    actual fun errorCodeEmailAddressInvalidHostname(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidHostname).localized()
    }

    actual fun errorCodeEmailAddressInvalidLocalPart(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidLocalPart).localized()
    }

    actual fun errorCodeEmailAddressInvalidMxRecord(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidMxRecord).localized()
    }

    actual fun errorCodeEmailAddressInvalidSegment(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidSegment).localized()
    }

    actual fun errorCodeEmailAddressLengthExceeded(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressLengthExceeded).localized()
    }

    actual fun errorCodeEmailAddressQuotedString(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressQuotedString).localized()
    }

    actual fun errorCodeEmailExists(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailExists).localized()
    }

    actual fun errorCodeEmailUnknown(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailUnknown).localized()
    }

    actual fun errorCodeError(): String {
        return StringDesc.Resource(MR.strings.errorCodeError).localized()
    }

    actual fun errorCodeEventIsInactive(): String {
        return StringDesc.Resource(MR.strings.errorCodeEventIsInactive).localized()
    }

    actual fun errorCodeEventIsPaused(): String {
        return StringDesc.Resource(MR.strings.errorCodeEventIsPaused).localized()
    }

    actual fun errorCodeInvalidCredentials(): String {
        return StringDesc.Resource(MR.strings.errorCodeInvalidCredentials).localized()
    }

    actual fun errorCodeIsEmpty(): String {
        return StringDesc.Resource(MR.strings.errorCodeIsEmpty).localized()
    }

    actual fun errorCodeMaxPointsReached(): String {
        return StringDesc.Resource(MR.strings.errorCodeMaxPointsReached).localized()
    }

    actual fun errorCodeNoAccessForPhotographers(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoAccessForPhotographers).localized()
    }

    actual fun errorCodeNoEventAccess(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoEventAccess).localized()
    }

    actual fun errorCodeNoEventFound(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoEventFound).localized()
    }

    actual fun errorCodeNoWaypointId(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoWaypointId).localized()
    }

    actual fun errorCodeNoWaypointMatching(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoWaypointMatching).localized()
    }

    actual fun errorCodeNotActive(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotActive).localized()
    }

    actual fun errorCodeNotAlnum(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotAlnum).localized()
    }

    actual fun errorCodeNotAlpha(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotAlpha).localized()
    }

    actual fun errorCodeNotDigits(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotDigits).localized()
    }

    actual fun errorCodeNotSame(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotSame).localized()
    }

    actual fun errorCodeOutOfMemory(): String {
        return StringDesc.Resource(MR.strings.errorCodeOutOfMemory).localized()
    }

    actual fun errorCodePhoneNumberError(): String {
        return StringDesc.Resource(MR.strings.errorCodePhoneNumberError).localized()
    }

    actual fun errorCodeQrNotAllowedByEventOwner(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrNotAllowedByEventOwner).localized()
    }

    actual fun errorCodeQrNotValid(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrNotValid).localized()
    }

    actual fun errorCodeQrOverused(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrOverused).localized()
    }

    actual fun errorCodeQrRequired(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrRequired).localized()
    }

    actual fun errorCodeSolvingAsPhotographer(): String {
        return StringDesc.Resource(MR.strings.errorCodeSolvingAsPhotographer).localized()
    }

    actual fun errorCodeTeamIsPlayer(): String {
        return StringDesc.Resource(MR.strings.errorCodeTeamIsPlayer).localized()
    }

    actual fun errorCodeWaypointPassed(): String {
        return StringDesc.Resource(MR.strings.errorCodeWaypointPassed).localized()
    }

    actual fun noInternetConnection(): String {
        return StringDesc.Resource(MR.strings.noInternetConnection).localized()
    }

    actual fun noInternetConnectionOk(): String {
        return StringDesc.Resource(MR.strings.noInternetConnectionOk).localized()
    }

    actual fun noInternetConnectionTryAgain(): String {
        return StringDesc.Resource(MR.strings.noInternetConnectionTryAgain).localized()
    }

    actual fun waypointPassed(): String {
        return StringDesc.Resource(MR.strings.waypointPassed).localized()
    }

    actual fun operationNotAllowed(): String {
        return StringDesc.Resource(MR.strings.operationNotAllowed).localized()
    }

    actual fun eventErrorLoading(): String {
        return StringDesc.Resource(MR.strings.eventErrorLoading).localized()
    }

    actual fun msgTechnicalError(): String {
        return StringDesc.Resource(MR.strings.msgTechnicalError).localized()
    }
}