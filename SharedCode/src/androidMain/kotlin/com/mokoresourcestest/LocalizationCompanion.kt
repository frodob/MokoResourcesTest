package com.mokoresourcestest

import com.mokoresourcestest.application
import dev.icerock.moko.resources.desc.*
import resources.generated.MR

internal actual class LocalizationCompanion {

    // VARIOUS
    actual fun agree(): String {
        return StringDesc.Resource(MR.strings.agree).toString(application)
    }

    actual fun accept(): String {
        return StringDesc.Resource(MR.strings.accept).toString(application)
    }

    actual fun attention(): String {
        return StringDesc.Resource(MR.strings.attention).toString(application)
    }

    actual fun cancel(): String {
        return StringDesc.Resource(MR.strings.cancel).toString(application)
    }

    actual fun close(): String {
        return StringDesc.Resource(MR.strings.close).toString(application)
    }

    actual fun `continue`(): String {
        return StringDesc.Resource(MR.strings.continueMy).toString(application)
    }

    actual fun done(): String {
        return StringDesc.Resource(MR.strings.done).toString(application)
    }

    actual fun dots(): String {
        return StringDesc.Resource(MR.strings.dots).toString(application)
    }

    actual fun edit(): String {
        return StringDesc.Resource(MR.strings.edit).toString(application)
    }

    actual fun end(): String {
        return StringDesc.Resource(MR.strings.end).toString(application)
    }

    actual fun exit(): String {
        return StringDesc.Resource(MR.strings.exit).toString(application)
    }

    actual fun later(): String {
        return StringDesc.Resource(MR.strings.later).toString(application)
    }

    actual fun loading(): String {
        return StringDesc.Resource(MR.strings.loading).toString(application)
    }

    actual fun more(): String {
        return StringDesc.Resource(MR.strings.more).toString(application)
    }

    actual fun next(): String {
        return StringDesc.Resource(MR.strings.next).toString(application)
    }

    actual fun no(): String {
        return StringDesc.Resource(MR.strings.no).toString(application)
    }

    actual fun ok(): String {
        return StringDesc.Resource(MR.strings.ok).toString(application)
    }

    actual fun show(): String {
        return StringDesc.Resource(MR.strings.show).toString(application)
    }

    actual fun success(): String {
        return StringDesc.Resource(MR.strings.success).toString(application)
    }

    actual fun synchronize(): String {
        return StringDesc.Resource(MR.strings.synchronize).toString(application)
    }

    actual fun tryAgain(): String {
        return StringDesc.Resource(MR.strings.tryAgain).toString(application)
    }

    actual fun version(): String {
        return StringDesc.Resource(MR.strings.version).toString(application)
    }

    actual fun yes(): String {
        return StringDesc.Resource(MR.strings.yes).toString(application)
    }

    actual fun imprint(): String {
        return StringDesc.Resource(MR.strings.imprint).toString(application)
    }

    actual fun licenses(): String {
        return StringDesc.Resource(MR.strings.licenses).toString(application)
    }

    actual fun privacyPolicy(): String {
        return StringDesc.Resource(MR.strings.privacyPolicy).toString(application)
    }

    actual fun teamsAndConditions(): String {
        return StringDesc.Resource(MR.strings.teamsAndConditions).toString(application)
    }

    // time
    actual fun days(count: Int): String {
        return StringDesc.Plural(MR.plurals.days, count).toString(application)
    }

    actual fun hours(count: Int): String {
        return StringDesc.Plural(MR.plurals.hours, count).toString(application)
    }

    actual fun minutes(count: Int): String {
        return StringDesc.Plural(MR.plurals.minutes, count).toString(application)
    }

    actual fun seconds(count: Int): String {
        return StringDesc.Plural(MR.plurals.seconds, count).toString(application)
    }

    actual fun timeRemaining(): String {
        return StringDesc.Resource(MR.strings.timeRemaining).toString(application)
    }

    actual fun timeCountdownTitle(): String {
        return StringDesc.Resource(MR.strings.timeCountdownTitle).toString(application)
    }

    // person
    actual fun city(): String {
        return StringDesc.Resource(MR.strings.city).toString(application)
    }

    actual fun female(): String {
        return StringDesc.Resource(MR.strings.female).toString(application)
    }

    actual fun firstname(): String {
        return StringDesc.Resource(MR.strings.firstname).toString(application)
    }

    actual fun gender(): String {
        return StringDesc.Resource(MR.strings.gender).toString(application)
    }

    actual fun lastname(): String {
        return StringDesc.Resource(MR.strings.lastname).toString(application)
    }

    actual fun male(): String {
        return StringDesc.Resource(MR.strings.male).toString(application)
    }

    actual fun number(): String {
        return StringDesc.Resource(MR.strings.number).toString(application)
    }

    actual fun street(): String {
        return StringDesc.Resource(MR.strings.street).toString(application)
    }

    actual fun zipcode(): String {
        return StringDesc.Resource(MR.strings.zipcode).toString(application)
    }

    // register
    actual fun registerTitle(): String {
        return StringDesc.Resource(MR.strings.registerTitle).toString(application)
    }

    actual fun registerBtn(): String {
        return StringDesc.Resource(MR.strings.registerBtn).toString(application)
    }

    actual fun registerMessage(): String {
        return StringDesc.Resource(MR.strings.registerMessage).toString(application)
    }

    actual fun registerUsername(): String {
        return StringDesc.Resource(MR.strings.registerUsername).toString(application)
    }

    actual fun registerEmail(): String {
        return StringDesc.Resource(MR.strings.registerEmail).toString(application)
    }

    actual fun registerPassword(): String {
        return StringDesc.Resource(MR.strings.registerPassword).toString(application)
    }

    actual fun registerPasswordConfirm(): String {
        return StringDesc.Resource(MR.strings.registerPasswordConfirm).toString(application)
    }

    actual fun registerAccept(): String {
        return StringDesc.Resource(MR.strings.registerAccept).toString(application)
    }

    actual fun registerAcceptContinue(): String {
        return StringDesc.Resource(MR.strings.registerAcceptContinue).toString(application)
    }

    actual fun registerAcceptGTC(): String {
        return StringDesc.Resource(MR.strings.registerAcceptGTC).toString(application)
    }

    actual fun registerAcceptPP(): String {
        return StringDesc.Resource(MR.strings.registerAcceptPP).toString(application)
    }

    actual fun registerGTC(): String {
        return StringDesc.Resource(MR.strings.registerGTC).toString(application)
    }

    actual fun registerPP(): String {
        return StringDesc.Resource(MR.strings.registerPP).toString(application)
    }

    actual fun registerMemberNumber(): String {
        return StringDesc.Resource(MR.strings.registerMemberNumber).toString(application)
    }

    actual fun registerMsgOk(): String {
        return StringDesc.Resource(MR.strings.registerMsgOk).toString(application)
    }

    // demo user dialog
    actual fun demoAlreadyUsed(): String {
        return StringDesc.Resource(MR.strings.demoAlreadyUsed).toString(application)
    }

    actual fun demoAlreadyUsedDelete(): String {
        return StringDesc.Resource(MR.strings.demoAlreadyUsedDelete).toString(application)
    }

    actual fun demoQuestion(): String {
        return StringDesc.Resource(MR.strings.demoQuestion).toString(application)
    }

    actual fun demoQuestionRetry(): String {
        return StringDesc.Resource(MR.strings.demoQuestionRetry).toString(application)
    }

    actual fun demoLoginUnauthorizedEvent(): String {
        return StringDesc.ResourceFormatted(MR.strings.demoLoginUnauthorizedEvent, LocalizationManager.eventInLine(1)).toString(application)
    }

    // login
    actual fun loginTitle(): String {
        return StringDesc.Resource(MR.strings.loginTitle).toString(application)
    }

    actual fun login(): String {
        return StringDesc.Resource(MR.strings.login).toString(application)
    }

    actual fun loginMessage(): String {
        return StringDesc.Resource(MR.strings.loginMessage).toString(application)
    }

    actual fun loginEmail(): String {
        return StringDesc.Resource(MR.strings.loginEmail).toString(application)
    }

    actual fun loginPassword(): String {
        return StringDesc.Resource(MR.strings.loginPassword).toString(application)
    }

    actual fun loginWithoutRegistration(): String {
        return StringDesc.Resource(MR.strings.loginWithoutRegistration).toString(application)
    }

    // forgot password
    actual fun forgotPwRequest(): String {
        return StringDesc.Resource(MR.strings.forgotPwRequest).toString(application)
    }

    actual fun forgotPwMessage(): String {
        return StringDesc.Resource(MR.strings.forgotPwMessage).toString(application)
    }

    actual fun forgotPwAnswer(): String {
        return StringDesc.Resource(MR.strings.forgotPwAnswer).toString(application)
    }


    // EVENTS
    actual fun event(count: Int): String {
        return StringDesc.Plural(MR.plurals.event, count).toString(application)
    }

    actual fun eventInLine(count: Int): String {
        return StringDesc.Plural(MR.plurals.eventInLine, count).toString(application)
    }

    actual fun eventInLineWith(): String {
        return StringDesc.Resource(MR.strings.eventInLineWith).toString(application)
    }

    actual fun eventList(): String {
        return StringDesc.Resource(MR.strings.eventList).toString(application)
    }

    actual fun eventListInLine(): String {
        return StringDesc.Resource(MR.strings.eventListInLine).toString(application)
    }

    actual fun eventNew(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventNew, LocalizationManager.eventInLine(1)).toString(application)
    }

    // EASY EVENT AND EVENT LIST
    actual fun easyEventMessage(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventMessage, LocalizationManager.eventInLineWith(), LocalizationManager.eventListInLine()).toString(application)
    }

    actual fun easyEventContinue(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventContinue, LocalizationManager.eventInLine(1)).toString(application)
    }

    actual fun easyEventAlternative(): String {
        return StringDesc.ResourceFormatted(MR.strings.easyEventAlternative, LocalizationManager.eventInLineWith()).toString(application)
    }

    actual fun eventsActive(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsActive, LocalizationManager.eventInLine(2)).toString(application)
    }

    actual fun eventsExpired(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsExpired, LocalizationManager.eventInLine(2)).toString(application)
    }

    actual fun eventsMy(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsMy, LocalizationManager.eventInLine(2)).toString(application)
    }

    actual fun eventsPublic(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsPublic, LocalizationManager.eventInLine(2)).toString(application)
    }

    actual fun eventsPremium(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsPremium, LocalizationManager.eventInLine(2)).toString(application)
    }

    actual fun eventsTimeLeft(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventsTimeLeft, LocalizationManager.event(1)).toString(application)
    }

    actual fun eventsFree(): String {
        return StringDesc.Resource(MR.strings.eventsFree).toString(application)
    }

    actual fun eventChanged(): String {
        return StringDesc.ResourceFormatted(MR.strings.eventChanged, LocalizationManager.event(1)).toString(application)
    }

    // WelcomeDialog
    actual fun welcomeTeamTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamTitle).toString(application)
    }

    actual fun welcomeTeamMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamMessage).toString(application)
    }

    actual fun welcomeTeamPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamPlaceholder).toString(application)
    }

    actual fun welcomeTeamError(): String {
        return StringDesc.Resource(MR.strings.welcomeTeamError).toString(application)
    }

    actual fun welcomeParticipantsTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsTitle).toString(application)
    }

    actual fun welcomeParticipantsMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsMessage).toString(application)
    }

    actual fun welcomeParticipantsPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsPlaceholder).toString(application)
    }

    actual fun welcomeParticipantsError(): String {
        return StringDesc.Resource(MR.strings.welcomeParticipantsError).toString(application)
    }

    actual fun welcomeEmailTitle(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailTitle).toString(application)
    }

    actual fun welcomeEmailMessage(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailMessage).toString(application)
    }

    actual fun welcomeEmailPlaceholder(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailPlaceholder).toString(application)
    }

    actual fun welcomeEmailError(): String {
        return StringDesc.Resource(MR.strings.welcomeEmailError).toString(application)
    }

    actual fun welcomeDone(): String {
        return StringDesc.Resource(MR.strings.welcomeDone).toString(application)
    }

    // MENU
    actual fun menuBriefing(): String {
        return StringDesc.Resource(MR.strings.menuBriefing).toString(application)
    }

    actual fun menuChat(): String {
        return StringDesc.Resource(MR.strings.menuChat).toString(application)
    }

    actual fun menuChatNewRoom(): String {
        return StringDesc.Resource(MR.strings.menuChatNewRoom).toString(application)
    }

    actual fun menuChatEditRoom(): String {
        return StringDesc.Resource(MR.strings.menuChatEditRoom).toString(application)
    }

    actual fun menuEmergency(): String {
        return StringDesc.Resource(MR.strings.menuEmergency).toString(application)
    }

    actual fun menuHighScore(): String {
        return StringDesc.Resource(MR.strings.menuHighScore).toString(application)
    }

    actual fun menuLogin(): String {
        return StringDesc.Resource(MR.strings.menuLogin).toString(application)
    }

    actual fun menuMap(): String {
        return StringDesc.Resource(MR.strings.menuMap).toString(application)
    }

    actual fun menuOpCall(): String {
        return StringDesc.Resource(MR.strings.menuOpCall).toString(application)
    }

    actual fun menuProfile(): String {
        return StringDesc.Resource(MR.strings.menuProfile).toString(application)
    }

    actual fun menuStatistics(): String {
        return StringDesc.Resource(MR.strings.menuStatistics).toString(application)
    }

    actual fun menuTask(): String {
        return StringDesc.Resource(MR.strings.menuTask).toString(application)
    }

    actual fun menuTaskList(): String {
        return StringDesc.Resource(MR.strings.menuTaskList).toString(application)
    }

    actual fun menuTutorial(): String {
        return StringDesc.Resource(MR.strings.menuTutorial).toString(application)
    }

    actual fun menuPhoto(): String {
        return StringDesc.Resource(MR.strings.menuPhoto).toString(application)
    }

    actual fun menuQR(): String {
        return StringDesc.Resource(MR.strings.menuQR).toString(application)
    }

    actual fun menuAR(): String {
        return StringDesc.Resource(MR.strings.menuAR).toString(application)
    }

    actual fun menuPassword(): String {
        return StringDesc.Resource(MR.strings.menuPassword).toString(application)
    }

    // DEMO
    actual fun gameInfo(): String {
        return StringDesc.Resource(MR.strings.gameInfo).toString(application)
    }

    actual fun demoTitle(): String {
        return StringDesc.Resource(MR.strings.demoTitle).toString(application)
    }

    actual fun demoMessage(): String {
        return StringDesc.Resource(MR.strings.demoMessage).toString(application)
    }

    // SPECIAL
    actual fun dialogExitReally(): String {
        return StringDesc.Resource(MR.strings.dialogExitReally).toString(application)
    }

    actual fun dialogNewEventMessage(count: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.dialogNewEventMessage, count, LocalizationManager.eventInLine(1)).toString(application)
    }

    actual fun dialogNoMagnetSensorMessage(): String {
        return StringDesc.Resource(MR.strings.dialogNoMagnetSensorMessage).toString(application)
    }

    actual fun dialogNoMagnetSensorTitle(): String {
        return StringDesc.Resource(MR.strings.dialogNoMagnetSensorTitle).toString(application)
    }

    // GPS
    actual fun gpsContinue(): String {
        return StringDesc.Resource(MR.strings.gpsContinue).toString(application)
    }

    actual fun gpsEnable(): String {
        return StringDesc.Resource(MR.strings.gpsEnable).toString(application)
    }

    actual fun gpsNoSignal(): String {
        return StringDesc.Resource(MR.strings.gpsNoSignal).toString(application)
    }

    actual fun gpsNotEnabled(): String {
        return StringDesc.Resource(MR.strings.gpsNotEnabled).toString(application)
    }

    // TASK and TASK LIST
    actual fun task(): String {
        return StringDesc.Resource(MR.strings.task).toString(application)
    }

    actual fun taskDistance(): String {
        return StringDesc.Resource(MR.strings.taskDistance).toString(application)
    }

    actual fun taskName(): String {
        return StringDesc.Resource(MR.strings.taskName).toString(application)
    }

    actual fun taskNr(): String {
        return StringDesc.Resource(MR.strings.taskNr).toString(application)
    }

    actual fun taskPoints(): String {
        return StringDesc.Resource(MR.strings.taskPoints).toString(application)
    }

    actual fun taskTabSpot(nr: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskTabSpot, LocalizationManager.taskTaskName(), nr).toString(application)
    }

    actual fun taskTaskName(): String {
        return StringDesc.Resource(MR.strings.taskTaskName).toString(application)
    }

    actual fun taskTime(): String {
        return StringDesc.Resource(MR.strings.taskTime).toString(application)
    }

    actual fun taskType(): String {
        return StringDesc.Resource(MR.strings.taskType).toString(application)
    }

    // QUEST DETAILS
    actual fun taskActive(): String {
        return StringDesc.ResourceFormatted(MR.strings.taskActive, LocalizationManager.taskTaskName()).toString(application)
    }

    actual fun taskActiveVoting(): String {
        return StringDesc.Resource(MR.strings.taskActiveVoting).toString(application)
    }

    actual fun taskCheckin(): String {
        return StringDesc.Resource(MR.strings.taskCheckin).toString(application)
    }

    actual fun taskDetail(): String {
        return StringDesc.Resource(MR.strings.taskDetail).toString(application)
    }

    actual fun taskSolution(): String {
        return StringDesc.Resource(MR.strings.taskSolution).toString(application)
    }

    actual fun taskEventNotActive(): String {
        return StringDesc.Resource(MR.strings.taskEventNotActive).toString(application)
    }

    actual fun taskFailed(): String {
        return StringDesc.Resource(MR.strings.taskFailed).toString(application)
    }

    actual fun taskInactive(): String {
        return StringDesc.Resource(MR.strings.taskInactive).toString(application)
    }

    actual fun taskNotInRange(distance: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskNotInRange, distance).toString(application)
    }

    actual fun taskPass(): String {
        return StringDesc.Resource(MR.strings.taskPass).toString(application)
    }

    actual fun taskPassed(): String {
        return StringDesc.Resource(MR.strings.taskPassed).toString(application)
    }

    actual fun taskPictures(): String {
        return StringDesc.Resource(MR.strings.taskPictures).toString(application)
    }

    actual fun taskSolve(): String {
        return StringDesc.ResourceFormatted(MR.strings.taskSolve, LocalizationManager.taskTaskName()).toString(application)
    }

    actual fun taskSolveVoting(): String {
        return StringDesc.Resource(MR.strings.taskSolveVoting).toString(application)
    }

    actual fun taskSolved(): String {
        return StringDesc.Resource(MR.strings.taskSolved).toString(application)
    }

    actual fun taskSolvedVoting(): String {
        return StringDesc.Resource(MR.strings.taskSolvedVoting).toString(application)
    }

    actual fun taskTooFar(distance: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.taskTooFar, distance).toString(application)
    }

    // Password Dialog
    actual fun passwordEnter(): String {
        return StringDesc.Resource(MR.strings.passwordEnter).toString(application)
    }

    actual fun passwordWrong(): String {
        return StringDesc.Resource(MR.strings.passwordWrong).toString(application)
    }

    // SOLUTION Dialog
    actual fun solveCorrectSolution(): String {
        return StringDesc.Resource(MR.strings.solveCorrectSolution).toString(application)
    }

    actual fun solveCorrectVoting(): String {
        return StringDesc.Resource(MR.strings.solveCorrectVoting).toString(application)
    }

    actual fun solveMcEmpty(): String {
        return StringDesc.Resource(MR.strings.solveMcEmpty).toString(application)
    }

    actual fun solveMcFull(maxAnswers: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveMcFull, maxAnswers, maxAnswers).toString(application)
    }

    actual fun solveMcMissingAnswers(missing: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveMcMissingAnswers, missing, missing).toString(application)
    }

    actual fun solveMcMissingAnswerExact(): String {
        return StringDesc.Resource(MR.strings.solveMcMissingAnswerExact).toString(application)
    }

    actual fun solveTextEmpty(): String {
        return StringDesc.Resource(MR.strings.solveTextEmpty).toString(application)
    }

    actual fun solveTextEmptyVoting(): String {
        return StringDesc.Resource(MR.strings.solveTextEmptyVoting).toString(application)
    }

    actual fun solveTitle(): String {
        return StringDesc.Resource(MR.strings.solveTitle).toString(application)
    }

    actual fun solveVotingEmptyDialog(): String {
        return StringDesc.Resource(MR.strings.solveVotingEmptyDialog).toString(application)
    }

    actual fun solveVotingMissingMinVote(maxVotes: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveVotingMissingMinVote, maxVotes, maxVotes).toString(application)
    }

    actual fun solveVotingMissingStars(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveVotingMissingStars, count, count).toString(application)
    }

    actual fun solveVotingMissingVotes(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveVotingMissingVotes, count, count).toString(application)
    }

    actual fun solveVotingStarsFull(maxVotes: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveVotingStarsFull, maxVotes, maxVotes).toString(application)
    }

    actual fun solveVotingVotesFull(maxVotes: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.solveVotingVotesFull, maxVotes, maxVotes).toString(application)
    }

    actual fun solveWrongSolution(): String {
        return StringDesc.Resource(MR.strings.solveWrongSolution).toString(application)
    }

    // SOLVE CONTROLLER
    actual fun correctWas(): String {
        return StringDesc.Resource(MR.strings.correctWas).toString(application)
    }

    actual fun correctWasMedia(): String {
        return StringDesc.Resource(MR.strings.correctWasMedia).toString(application)
    }

    actual fun triesLeft(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.triesLeft, count, count).toString(application)
    }

    actual fun triesLeftMany(): String {
        return StringDesc.Resource(MR.strings.triesLeftMany).toString(application)
    }

    // QR CODE
    actual fun qrAnotherQr(): String {
        return StringDesc.Resource(MR.strings.qrAnotherQr).toString(application)
    }

    actual fun qrTaskNotFound(): String {
        return StringDesc.ResourceFormatted(MR.strings.qrTaskNotFound, LocalizationManager.taskTaskName()).toString(application)
    }

    // AR
    actual fun arDidNotFinishLoading(progress: Int): String {
        return StringDesc.ResourceFormatted(MR.strings.arDidNotFinishLoading, progress).toString(application)
    }

    // STATS
    actual fun statsTeam(): String {
        return StringDesc.Resource(MR.strings.statsTeam).toString(application)
    }

    actual fun statsTeamName(): String {
        return StringDesc.Resource(MR.strings.statsTeamName).toString(application)
    }

    actual fun statsRank(): String {
        return StringDesc.Resource(MR.strings.statsRank).toString(application)
    }

    actual fun statsSolved(): String {
        return StringDesc.Resource(MR.strings.statsSolved).toString(application)
    }

    actual fun statsNotSolved(): String {
        return StringDesc.Resource(MR.strings.statsNotSolved).toString(application)
    }

    actual fun statsAverage(): String {
        return StringDesc.Resource(MR.strings.statsAverage).toString(application)
    }

    actual fun statsProgress(): String {
        return StringDesc.Resource(MR.strings.statsProgress).toString(application)
    }

    actual fun statsUnfinished(): String {
        return StringDesc.Resource(MR.strings.statsUnfinished).toString(application)
    }

    // STATISTIC
    actual fun statisticCompare(): String {
        return StringDesc.Resource(MR.strings.statisticCompare).toString(application)
    }

    actual fun statisticMyTeam(): String {
        return StringDesc.Resource(MR.strings.statisticMyTeam).toString(application)
    }

    actual fun statisticOtherTeam(): String {
        return StringDesc.Resource(MR.strings.statisticOtherTeam).toString(application)
    }

    actual fun statisticDistance(): String {
        return StringDesc.Resource(MR.strings.statisticDistance).toString(application)
    }

    actual fun statisticOpen(): String {
        return StringDesc.Resource(MR.strings.statisticOpen).toString(application)
    }

    actual fun statisticNoData(): String {
        return StringDesc.Resource(MR.strings.statisticNoData).toString(application)
    }

    actual fun statisticNoHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticNoHighScore).toString(application)
    }

    actual fun statisticNoStatistic(): String {
        return StringDesc.Resource(MR.strings.statisticNoStatistic).toString(application)
    }

    actual fun statisticNotInHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticNotInHighScore).toString(application)
    }

    actual fun statisticTeamNotInHighScore(): String {
        return StringDesc.Resource(MR.strings.statisticTeamNotInHighScore).toString(application)
    }

    // OPERATOR
    actual fun `operator`(): String {
        return StringDesc.Resource(MR.strings.operator).toString(application)
    }

    actual fun operatorSend(): String {
        return StringDesc.Resource(MR.strings.operatorSend).toString(application)
    }

    actual fun operatorMe(): String {
        return StringDesc.Resource(MR.strings.operatorMe).toString(application)
    }

    actual fun operatorTitle(): String {
        return StringDesc.Resource(MR.strings.operatorTitle).toString(application)
    }

    actual fun operatorIsSending(): String {
        return StringDesc.Resource(MR.strings.operatorIsSending).toString(application)
    }

    // CHAT
    actual fun chatActivated(): String {
        return StringDesc.Resource(MR.strings.chatActivated).toString(application)
    }

    actual fun chatActivatedLocal(): String {
        return StringDesc.Resource(MR.strings.chatActivatedLocal).toString(application)
    }

    actual fun chatAddChatroom(): String {
        return StringDesc.Resource(MR.strings.chatAddChatroom).toString(application)
    }

    actual fun chatAddChatroomAlreadyExists(): String {
        return StringDesc.Resource(MR.strings.chatAddChatroomAlreadyExists).toString(application)
    }

    actual fun chatAddName(): String {
        return StringDesc.Resource(MR.strings.chatAddName).toString(application)
    }

    actual fun chatAddRoomSelect(): String {
        return StringDesc.Resource(MR.strings.chatAddRoomSelect).toString(application)
    }

    actual fun chatAddSelect(): String {
        return StringDesc.Resource(MR.strings.chatAddSelect).toString(application)
    }

    actual fun chatConnecting(): String {
        return StringDesc.Resource(MR.strings.chatConnecting).toString(application)
    }

    actual fun chatCreate(): String {
        return StringDesc.Resource(MR.strings.chatCreate).toString(application)
    }

    actual fun chatDeactivated(): String {
        return StringDesc.Resource(MR.strings.chatDeactivated).toString(application)
    }

    actual fun chatDeactivatedLocal(): String {
        return StringDesc.Resource(MR.strings.chatDeactivatedLocal).toString(application)
    }

    actual fun chatDeactivatedText(): String {
        return StringDesc.Resource(MR.strings.chatDeactivatedText).toString(application)
    }

    actual fun chatEmpty(): String {
        return StringDesc.Resource(MR.strings.chatEmpty).toString(application)
    }

    actual fun chatEmptyDeactivated(): String {
        return StringDesc.Resource(MR.strings.chatEmptyDeactivated).toString(application)
    }

    actual fun chatLeave(): String {
        return StringDesc.Resource(MR.strings.chatLeave).toString(application)
    }

    actual fun chatLeaveSure(): String {
        return StringDesc.Resource(MR.strings.chatLeaveSure).toString(application)
    }

    actual fun chatNewMessage(): String {
        return StringDesc.Resource(MR.strings.chatNewMessage).toString(application)
    }

    actual fun chatRemoveChatroom(): String {
        return StringDesc.Resource(MR.strings.chatRemoveChatroom).toString(application)
    }

    actual fun chatRoomName(): String {
        return StringDesc.Resource(MR.strings.chatRoomName).toString(application)
    }

    actual fun chatUserAdded(): String {
        return StringDesc.Resource(MR.strings.chatUserAdded).toString(application)
    }

    actual fun chatUserAddedLocal(): String {
        return StringDesc.Resource(MR.strings.chatUserAddedLocal).toString(application)
    }

    actual fun chatUserLeft(): String {
        return StringDesc.Resource(MR.strings.chatUserLeft).toString(application)
    }

    actual fun chatUserLeftLocal(): String {
        return StringDesc.Resource(MR.strings.chatUserLeftLocal).toString(application)
    }

    // PhotoUpload
    actual fun photoUploadError(): String {
        return StringDesc.Resource(MR.strings.photoUploadError).toString(application)
    }

    actual fun photoUploadSuccessful(): String {
        return StringDesc.Resource(MR.strings.photoUploadSuccessful).toString(application)
    }

    actual fun photoUploadSuccessfulGallery(): String {
        return StringDesc.Resource(MR.strings.photoUploadSuccessfulGallery).toString(application)
    }

    // VideoUpload
    actual fun videoUploadError(): String {
        return StringDesc.Resource(MR.strings.videoUploadError).toString(application)
    }

    actual fun videoUploadSuccessful(): String {
        return StringDesc.Resource(MR.strings.videoUploadSuccessful).toString(application)
    }

    // SETTINGS
    actual fun settingsMoreEvents(): String {
        return StringDesc.ResourceFormatted(MR.strings.settingsMoreEvents, LocalizationManager.event(2)).toString(application)
    }

    actual fun settingsPackAndGo(): String {
        return StringDesc.Resource(MR.strings.settingsPackAndGo).toString(application)
    }

    actual fun settingsLanguage(): String {
        return StringDesc.Resource(MR.strings.settingsLanguage).toString(application)
    }

    actual fun settingsDeviceInformation(): String {
        return StringDesc.Resource(MR.strings.settingsDeviceInformation).toString(application)
    }

    actual fun settingsLogout(): String {
        return StringDesc.Resource(MR.strings.settingsLogout).toString(application)
    }

    actual fun settingsNotSynchronized(): String {
        return StringDesc.Resource(MR.strings.settingsNotSynchronized).toString(application)
    }

    actual fun synchronizeAll(): String {
        return StringDesc.Resource(MR.strings.synchronizeAll).toString(application)
    }

    actual fun synchronizeAuthenticate(): String {
        return StringDesc.Resource(MR.strings.synchronizeAuthenticate).toString(application)
    }

    actual fun synchronizeChat(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.synchronizeChat, count, count).toString(application)
    }

    actual fun synchronizeMedia(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.synchronizeMedia, count, count).toString(application)
    }

    actual fun synchronizeSolutions(count: Int): String {
        return StringDesc.PluralFormatted(MR.plurals.synchronizeSolutions, count, count).toString(application)
    }

    actual fun synchronizeTitle(): String {
        return StringDesc.Resource(MR.strings.synchronizeTitle).toString(application)
    }

    // LANGUAGES
    actual fun langEN(): String {
        return StringDesc.Resource(MR.strings.langEN).toString(application)
    }

    actual fun langDE(): String {
        return StringDesc.Resource(MR.strings.langDE).toString(application)
    }

    actual fun langBG(): String {
        return StringDesc.Resource(MR.strings.langBG).toString(application)
    }

    actual fun langCZ(): String {
        return StringDesc.Resource(MR.strings.langCZ).toString(application)
    }

    actual fun langDA(): String {
        return StringDesc.Resource(MR.strings.langDA).toString(application)
    }

    actual fun langES(): String {
        return StringDesc.Resource(MR.strings.langES).toString(application)
    }

    actual fun langFR(): String {
        return StringDesc.Resource(MR.strings.langFR).toString(application)
    }

    actual fun langHE(): String {
        return StringDesc.Resource(MR.strings.langHE).toString(application)
    }

    actual fun langHU(): String {
        return StringDesc.Resource(MR.strings.langHU).toString(application)
    }

    actual fun langIT(): String {
        return StringDesc.Resource(MR.strings.langIT).toString(application)
    }

    actual fun langNL(): String {
        return StringDesc.Resource(MR.strings.langNL).toString(application)
    }

    actual fun langNotAvailable(): String {
        return StringDesc.Resource(MR.strings.langNotAvailable).toString(application)
    }

    // DEVICE INFORMATION
    actual fun deviceSystemVersion(): String {
        return StringDesc.Resource(MR.strings.deviceSystemVersion).toString(application)
    }

    actual fun deviceAppVersion(): String {
        return StringDesc.Resource(MR.strings.deviceAppVersion).toString(application)
    }

    actual fun deviceSynchronisation(): String {
        return StringDesc.Resource(MR.strings.deviceSynchronisation).toString(application)
    }

    actual fun deviceUnsend(): String {
        return StringDesc.Resource(MR.strings.deviceUnsend).toString(application)
    }

    actual fun deviceUnsendResults(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendResults).toString(application)
    }

    actual fun deviceUnsendMedia(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendMedia).toString(application)
    }

    actual fun deviceUnsendChat(): String {
        return StringDesc.Resource(MR.strings.deviceUnsendChat).toString(application)
    }

    // USECASES
    actual fun loadMessageGetEventBranding(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventBranding).toString(application)
    }

    actual fun loadMessageGetEventCoins(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventCoins).toString(application)
    }

    actual fun loadMessageGetEventFiles(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventFiles).toString(application)
    }

    actual fun loadMessageGetEventOffline(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetEventOffline).toString(application)
    }

    actual fun loadMessageGetPlayerEvents(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayerEvents).toString(application)
    }

    actual fun loadMessageGetPlayer(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayer).toString(application)
    }

    actual fun loadMessageGetPlayerInfo(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetPlayerInfo).toString(application)
    }

    actual fun loadMessageLogin(): String {
        return StringDesc.Resource(MR.strings.loadMessageLogin).toString(application)
    }

    actual fun loadMessageRegister(): String {
        return StringDesc.Resource(MR.strings.loadMessageRegister).toString(application)
    }

    actual fun loadMessageRequestPasswordReset(): String {
        return StringDesc.Resource(MR.strings.loadMessageRequestPasswordReset).toString(application)
    }

    actual fun loadMessageUpdateUser(): String {
        return StringDesc.Resource(MR.strings.loadMessageUpdateUser).toString(application)
    }

    actual fun loadMessageGetTasks(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetTasks).toString(application)
    }

    actual fun loadMessageCheckInTask(): String {
        return StringDesc.Resource(MR.strings.loadMessageCheckInTask).toString(application)
    }

    actual fun loadMessageMediaGet(): String {
        return StringDesc.Resource(MR.strings.loadMessageMediaGet).toString(application)
    }

    actual fun loadMessageSolve(): String {
        return StringDesc.Resource(MR.strings.loadMessageSolve).toString(application)
    }

    actual fun loadMessageGetHighScore(): String {
        return StringDesc.Resource(MR.strings.loadMessageGetHighScore).toString(application)
    }

    actual fun loadMessageReadNewEvent(): String {
        return StringDesc.Resource(MR.strings.loadMessageReadNewEvent).toString(application)
    }

    actual fun loadMessageMediaUpload(): String {
        return StringDesc.Resource(MR.strings.loadMessageMediaUpload).toString(application)
    }

    actual fun loadMessageSetTeamEmail(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamEmail).toString(application)
    }

    actual fun loadMessageSetTeamName(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamName).toString(application)
    }

    actual fun loadMessageSetTeamParticipants(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamParticipants).toString(application)
    }

    actual fun loadMessageSetTeamPhoto(): String {
        return StringDesc.Resource(MR.strings.loadMessageSetTeamPhoto).toString(application)
    }

    actual fun loadMessageUnpacking(): String {
        return StringDesc.Resource(MR.strings.loadMessageUnpacking).toString(application)
    }

    actual fun loadMessageUploadImage(): String {
        return StringDesc.Resource(MR.strings.loadMessageUploadImage).toString(application)
    }

    actual fun loadMessageUploadVideo(): String {
        return StringDesc.Resource(MR.strings.loadMessageUploadVideo).toString(application)
    }

    // JSON Response error (codes), lookup using "error_code_"+errorCode
    actual fun anErrorOccurred(): String {
        return StringDesc.Resource(MR.strings.anErrorOccurred).toString(application)
    }

    actual fun errorAlertConnectionProblems(): String {
        return StringDesc.Resource(MR.strings.errorAlertConnectionProblems).toString(application)
    }

    actual fun errorAlertNoWritableSdcard(): String {
        return StringDesc.Resource(MR.strings.errorAlertNoWritableSdcard).toString(application)
    }

    actual fun errorCodeAlreadyExists(): String {
        return StringDesc.Resource(MR.strings.errorCodeAlreadyExists).toString(application)
    }

    actual fun errorCodeCantPlayAgain(): String {
        return StringDesc.Resource(MR.strings.errorCodeCantPlayAgain).toString(application)
    }

    actual fun errorCodeCombatSpotAlreadySolvedTitle(): String {
        return StringDesc.Resource(MR.strings.errorCodeCombatSpotAlreadySolvedTitle).toString(application)
    }

    actual fun errorCodeCombatSpotAlreadySolved(): String {
        return StringDesc.Resource(MR.strings.errorCodeCombatSpotAlreadySolved).toString(application)
    }

    actual fun errorCodeEmailAddressDotAtom(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressDotAtom).toString(application)
    }

    actual fun errorCodeEmailAddressInvalidFormat(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidFormat).toString(application)
    }

    actual fun errorCodeEmailAddressInvalidHostname(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidHostname).toString(application)
    }

    actual fun errorCodeEmailAddressInvalidLocalPart(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidLocalPart).toString(application)
    }

    actual fun errorCodeEmailAddressInvalidMxRecord(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidMxRecord).toString(application)
    }

    actual fun errorCodeEmailAddressInvalidSegment(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressInvalidSegment).toString(application)
    }

    actual fun errorCodeEmailAddressLengthExceeded(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressLengthExceeded).toString(application)
    }

    actual fun errorCodeEmailAddressQuotedString(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailAddressQuotedString).toString(application)
    }

    actual fun errorCodeEmailExists(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailExists).toString(application)
    }

    actual fun errorCodeEmailUnknown(): String {
        return StringDesc.Resource(MR.strings.errorCodeEmailUnknown).toString(application)
    }

    actual fun errorCodeError(): String {
        return StringDesc.Resource(MR.strings.errorCodeError).toString(application)
    }

    actual fun errorCodeEventIsInactive(): String {
        return StringDesc.Resource(MR.strings.errorCodeEventIsInactive).toString(application)
    }

    actual fun errorCodeEventIsPaused(): String {
        return StringDesc.Resource(MR.strings.errorCodeEventIsPaused).toString(application)
    }

    actual fun errorCodeInvalidCredentials(): String {
        return StringDesc.Resource(MR.strings.errorCodeInvalidCredentials).toString(application)
    }

    actual fun errorCodeIsEmpty(): String {
        return StringDesc.Resource(MR.strings.errorCodeIsEmpty).toString(application)
    }

    actual fun errorCodeMaxPointsReached(): String {
        return StringDesc.Resource(MR.strings.errorCodeMaxPointsReached).toString(application)
    }

    actual fun errorCodeNoAccessForPhotographers(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoAccessForPhotographers).toString(application)
    }

    actual fun errorCodeNoEventAccess(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoEventAccess).toString(application)
    }

    actual fun errorCodeNoEventFound(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoEventFound).toString(application)
    }

    actual fun errorCodeNoWaypointId(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoWaypointId).toString(application)
    }

    actual fun errorCodeNoWaypointMatching(): String {
        return StringDesc.Resource(MR.strings.errorCodeNoWaypointMatching).toString(application)
    }

    actual fun errorCodeNotActive(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotActive).toString(application)
    }

    actual fun errorCodeNotAlnum(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotAlnum).toString(application)
    }

    actual fun errorCodeNotAlpha(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotAlpha).toString(application)
    }

    actual fun errorCodeNotDigits(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotDigits).toString(application)
    }

    actual fun errorCodeNotSame(): String {
        return StringDesc.Resource(MR.strings.errorCodeNotSame).toString(application)
    }

    actual fun errorCodeOutOfMemory(): String {
        return StringDesc.Resource(MR.strings.errorCodeOutOfMemory).toString(application)
    }

    actual fun errorCodePhoneNumberError(): String {
        return StringDesc.Resource(MR.strings.errorCodePhoneNumberError).toString(application)
    }

    actual fun errorCodeQrNotAllowedByEventOwner(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrNotAllowedByEventOwner).toString(application)
    }

    actual fun errorCodeQrNotValid(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrNotValid).toString(application)
    }

    actual fun errorCodeQrOverused(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrOverused).toString(application)
    }

    actual fun errorCodeQrRequired(): String {
        return StringDesc.Resource(MR.strings.errorCodeQrRequired).toString(application)
    }

    actual fun errorCodeSolvingAsPhotographer(): String {
        return StringDesc.Resource(MR.strings.errorCodeSolvingAsPhotographer).toString(application)
    }

    actual fun errorCodeTeamIsPlayer(): String {
        return StringDesc.Resource(MR.strings.errorCodeTeamIsPlayer).toString(application)
    }

    actual fun errorCodeWaypointPassed(): String {
        return StringDesc.Resource(MR.strings.errorCodeWaypointPassed).toString(application)
    }

    actual fun noInternetConnection(): String {
        return StringDesc.Resource(MR.strings.noInternetConnection).toString(application)
    }

    actual fun noInternetConnectionOk(): String {
        return StringDesc.Resource(MR.strings.noInternetConnectionOk).toString(application)
    }

    actual fun noInternetConnectionTryAgain(): String {
        return StringDesc.Resource(MR.strings.noInternetConnectionTryAgain).toString(application)
    }

    actual fun waypointPassed(): String {
        return StringDesc.Resource(MR.strings.waypointPassed).toString(application)
    }

    actual fun operationNotAllowed(): String {
        return StringDesc.Resource(MR.strings.operationNotAllowed).toString(application)
    }

    actual fun eventErrorLoading(): String {
        return StringDesc.Resource(MR.strings.eventErrorLoading).toString(application)
    }

    actual fun msgTechnicalError(): String {
        return StringDesc.Resource(MR.strings.msgTechnicalError).toString(application)
    }
}