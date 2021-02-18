package com.mokoresourcestest

import kotlin.native.concurrent.ThreadLocal

private const val LOG_TAG = "LocalizationManager"

@ThreadLocal
object LocalizationManager {
    private val companion = LocalizationCompanion()

    var targetEventSingle = ""
    var targetEventOther = ""
    var targetEventInLineSingle = ""
    var targetEventInLineOther = ""
    var targetEventInLineWith = ""
    var targetEventList = ""
    var targetEventListInLine = ""
    private fun isTargetSet(): Boolean {
        return targetEventSingle.isNotEmpty() /* &&
                targetEventOther.isNotEmpty() &&
                targetEventInLineSingle.isNotEmpty() &&
                targetEventInLineOther.isNotEmpty() &&
                targetEventInLineWith.isNotEmpty() &&
                targetEventList.isNotEmpty() &&
                targetEventListInLine.isNotEmpty() */
    }

    // //////////////////////////////////////////////////////////////////////////
    //region CUSTOMS
    // //////////////////////////////////////////////////////////////////////////
    /*
        event (plurals)
        customPoints
        customHighScore
        customInfo
        customMap
        customTasks / taskList
        customTask
        customTaskPass
        customTaskCheckin
        customTaskSolve
        customTaskAac
     */

    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region VARIOUS
    // //////////////////////////////////////////////////////////////////////////
    fun agree() = companion.agree()
    fun accept() = companion.accept()
    fun attention() = companion.attention()
    fun cancel() = companion.cancel()
    fun close() = companion.close()
    fun `continue`() = companion.`continue`()
    fun done() = companion.done()
    fun dots() = companion.dots()
    fun edit() = companion.edit()
    fun end() = companion.end()
    fun exit() = companion.exit()
    fun later() = companion.later()
    fun loading() = companion.loading()
    fun more() = companion.more()
    fun next() = companion.next()
    fun no() = companion.no()
    fun ok() = companion.ok()
    fun show() = companion.show()
    fun success() = companion.success()
    fun synchronize() = companion.synchronize()
    fun tryAgain() = companion.tryAgain()
    fun version() = companion.version()
    fun yes() = companion.yes()

    fun imprint() = companion.imprint()
    fun licenses() = companion.licenses()
    fun privacyPolicy() = companion.privacyPolicy()
    fun teamsAndConditions() = companion.teamsAndConditions()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region TIME
    // //////////////////////////////////////////////////////////////////////////
    fun days(count: Int) = companion.days(count)
    fun hours(count: Int) = companion.hours(count)
    fun minutes(count: Int) = companion.minutes(count)
    fun seconds(count: Int) = companion.seconds(count)
    fun timeRemaining() = companion.timeRemaining()
    fun timeCountdownTitle() = companion.timeCountdownTitle()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region PERSON
    // //////////////////////////////////////////////////////////////////////////
    fun city() = companion.city()
    fun female() = companion.female()
    fun firstname() = companion.firstname()
    fun gender() = companion.gender()
    fun lastname() = companion.lastname()
    fun male() = companion.male()
    fun number() = companion.number()
    fun street() = companion.street()
    fun zipcode() = companion.zipcode()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region REGISTER
    // //////////////////////////////////////////////////////////////////////////
    fun registerTitle() = companion.registerTitle()
    fun registerBtn() = companion.registerBtn()
    fun registerMessage() = companion.registerMessage()
    fun registerUsername() = companion.registerUsername()
    fun registerEmail() = companion.registerEmail()
    fun registerPassword() = companion.registerPassword()
    fun registerPasswordConfirm() = companion.registerPasswordConfirm()
    fun registerAccept() = companion.registerAccept()
    fun registerAcceptContinue() = companion.registerAcceptContinue()
    fun registerAcceptGTC() = companion.registerAcceptGTC()
    fun registerAcceptPP() = companion.registerAcceptPP()
    fun registerGTC() = companion.registerGTC()
    fun registerPP() = companion.registerPP()
    fun registerMemberNumber() = companion.registerMemberNumber()
    fun registerMsgOk() = companion.registerMsgOk()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region Demo User Dialog
    // //////////////////////////////////////////////////////////////////////////
    fun demoAlreadyUsed() = companion.demoAlreadyUsed()
    fun demoAlreadyUsedDelete() = companion.demoAlreadyUsedDelete()
    fun demoQuestion() = companion.demoQuestion()
    fun demoQuestionRetry() = companion.demoQuestionRetry()
    fun demoLoginUnauthorizedEvent() = companion.demoLoginUnauthorizedEvent()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region LOGIN
    // //////////////////////////////////////////////////////////////////////////
    fun loginTitle() = companion.loginTitle()
    fun login() = companion.login()
    fun loginMessage() = companion.loginMessage()
    fun loginEmail() = companion.loginEmail()
    fun loginPassword() = companion.loginPassword()
    fun loginWithoutRegistration() = companion.loginWithoutRegistration()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region FORGOT PW
    // //////////////////////////////////////////////////////////////////////////
    fun forgotPwRequest() = companion.forgotPwRequest()
    fun forgotPwMessage() = companion.forgotPwMessage()
    fun forgotPwAnswer() = companion.forgotPwAnswer()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region EVENTS
    // //////////////////////////////////////////////////////////////////////////
    fun event(count: Int): String {
        return if (isTargetSet()) {
            if (count == 1) {
                targetEventSingle
            } else {
                targetEventOther
            }
        } else {
            companion.event(count)
        }
    }

    fun eventInLine(count: Int) = if (isTargetSet()) {
        if (count == 1) {
            targetEventInLineSingle
        } else {
            targetEventInLineOther
        }
    } else {
        companion.eventInLine(count)
    }

    fun eventInLineWith() = if (isTargetSet()) {
        targetEventInLineWith
    } else {
        companion.eventInLineWith()
    }

    fun eventList() = companion.eventList()
    fun eventListInLine() = companion.eventListInLine()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region EASY EVENT AND EVENT LIST
    // //////////////////////////////////////////////////////////////////////////
    fun eventNew() = companion.eventNew()
    fun easyEventMessage() = companion.easyEventMessage()
    fun easyEventContinue() = companion.easyEventContinue()
    fun easyEventAlternative() = companion.easyEventAlternative()
    fun eventsActive() = companion.eventsActive()
    fun eventsExpired() = companion.eventsExpired()
    fun eventsMy() = companion.eventsMy()
    fun eventsPublic() = companion.eventsPublic()
    fun eventsPremium() = companion.eventsPremium()
    fun eventsTimeLeft() = companion.eventsTimeLeft()
    fun eventsFree() = companion.eventsFree()
    fun eventChanged() = companion.eventChanged()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region WelcomeDialog
    // //////////////////////////////////////////////////////////////////////////
    fun welcomeTeamTitle() = companion.welcomeTeamTitle()
    fun welcomeTeamMessage() = companion.welcomeTeamMessage()
    fun welcomeTeamPlaceholder() = companion.welcomeTeamPlaceholder()
    fun welcomeTeamError() = companion.welcomeTeamError()
    fun welcomeParticipantsTitle() = companion.welcomeParticipantsTitle()
    fun welcomeParticipantsMessage() = companion.welcomeParticipantsMessage()
    fun welcomeParticipantsPlaceholder() = companion.welcomeParticipantsPlaceholder()
    fun welcomeParticipantsError() = companion.welcomeParticipantsError()
    fun welcomeEmailTitle() = companion.welcomeEmailTitle()
    fun welcomeEmailMessage() = companion.welcomeEmailMessage()
    fun welcomeEmailPlaceholder() = companion.welcomeEmailPlaceholder()
    fun welcomeEmailError() = companion.welcomeEmailError()
    fun welcomeDone() = companion.welcomeDone()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region MENU
    // //////////////////////////////////////////////////////////////////////////
    fun menuBriefing() = companion.menuBriefing()
    fun menuChat() = companion.menuChat()
    fun menuChatNewRoom() = companion.menuChatNewRoom()
    fun menuChatEditRoom() = companion.menuChatEditRoom()
    fun menuEmergency() = companion.menuEmergency()
    fun menuHighScore() = companion.menuHighScore()
    fun menuLogin() = companion.menuLogin()
    fun menuMap() = companion.menuMap()
    fun menuOpCall() = companion.menuOpCall()
    fun menuProfile() = companion.menuProfile()
    fun menuStatistics() = companion.menuStatistics()
    fun menuTask() = companion.menuTask()
    fun menuTaskList() = companion.menuTaskList()
    fun menuTutorial() = companion.menuTutorial()
    fun menuPhoto() = companion.menuPhoto()
    fun menuQR() = companion.menuQR()
    fun menuAR() = companion.menuAR()
    fun menuPassword() = companion.menuPassword()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region DEMO
    // //////////////////////////////////////////////////////////////////////////
    fun gameInfo() = companion.gameInfo()
    fun demoTitle() = companion.demoTitle()
    fun demoMessage() = companion.demoMessage()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region SPECIAL
    // //////////////////////////////////////////////////////////////////////////
    fun dialogExitReally() = companion.dialogExitReally()
    fun dialogNewEventMessage(count: Int) = companion.dialogNewEventMessage(count)
    fun dialogNoMagnetSensorMessage() = companion.dialogNoMagnetSensorMessage()
    fun dialogNoMagnetSensorTitle() = companion.dialogNoMagnetSensorTitle()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region GPS
    // //////////////////////////////////////////////////////////////////////////
    fun gpsContinue() = companion.gpsContinue()
    fun gpsEnable() = companion.gpsEnable()
    fun gpsNoSignal() = companion.gpsNoSignal()
    fun gpsNotEnabled() = companion.gpsNotEnabled()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region TASK and TASK LIST
    // //////////////////////////////////////////////////////////////////////////
    fun taskDistance() = companion.taskDistance()
    fun taskName() = companion.taskName()
    fun taskNr() = companion.taskNr()
    fun taskPoints() = companion.taskPoints()
    fun taskTabSpot(nr: Int) = companion.taskTabSpot(nr)
    fun taskTaskName() = companion.taskTaskName()
    fun taskTime() = companion.taskTime()
    fun taskType() = companion.taskType()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region QUEST DETAILS
    // //////////////////////////////////////////////////////////////////////////
    fun taskActive() = companion.taskActive()
    fun taskActiveVoting() = companion.taskActiveVoting()
    fun taskCheckin() = companion.taskCheckin()
    fun taskDetail() = companion.taskDetail()
    fun taskSolution() = companion.taskSolution()
    fun taskEventNotActive() = companion.taskEventNotActive()
    fun taskFailed() = companion.taskFailed()
    fun taskInactive() = companion.taskInactive()
    fun taskNotInRange(distance: Int) = companion.taskNotInRange(distance)
    fun taskPass() = companion.taskPass()
    fun taskPassed() = companion.taskPassed()
    fun taskPictures() = companion.taskPictures()
    fun taskSolve() = companion.taskSolve()
    fun taskSolveVoting() = companion.taskSolveVoting()
    fun taskSolved() = companion.taskSolved()
    fun taskSolvedVoting() = companion.taskSolvedVoting()
    fun taskTooFar(distance: Int) = companion.taskTooFar(distance)
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region Password Dialog
    // //////////////////////////////////////////////////////////////////////////
    fun passwordEnter() = companion.passwordEnter()
    fun passwordWrong() = companion.passwordWrong()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region SOLUTION Dialog
    // //////////////////////////////////////////////////////////////////////////
    fun solveCorrectSolution() = companion.solveCorrectSolution()
    fun solveCorrectVoting() = companion.solveCorrectVoting()
    fun solveMcEmpty() = companion.solveMcEmpty()
    fun solveMcFull(maxAnswers: Int) = companion.solveMcFull(maxAnswers)
    fun solveMcMissingAnswers(missing: Int) = companion.solveMcMissingAnswers(missing)
    fun solveMcMissingAnswerExact() = companion.solveMcMissingAnswerExact()
    fun solveTextEmpty() = companion.solveTextEmpty()
    fun solveTextEmptyVoting() = companion.solveTextEmptyVoting()
    fun solveTitle() = companion.solveTitle()
    fun solveVotingEmptyDialog() = companion.solveVotingEmptyDialog()
    fun solveVotingMissingMinVote(maxVotes: Int) = companion.solveVotingMissingMinVote(maxVotes)
    fun solveVotingMissingStars(count: Int) = companion.solveVotingMissingStars(count)
    fun solveVotingMissingVotes(count: Int) = companion.solveVotingMissingVotes(count)
    fun solveVotingStarsFull(maxVotes: Int) = companion.solveVotingStarsFull(maxVotes)
    fun solveVotingVotesFull(maxVotes: Int) = companion.solveVotingVotesFull(maxVotes)
    fun solveWrongSolution() = companion.solveWrongSolution()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region SOLVE CONTROLLER
    // //////////////////////////////////////////////////////////////////////////
    fun correctWas() = companion.correctWas()
    fun correctWasMedia() = companion.correctWasMedia()
    fun triesLeft(count: Int) = if (count > 3) {
        companion.triesLeftMany()
    } else {
        companion.triesLeft(count)
    }
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region QR CODE
    // //////////////////////////////////////////////////////////////////////////
    fun qrAnotherQr() = companion.qrAnotherQr()
    fun qrTaskNotFound() = companion.qrTaskNotFound()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region AR
    // //////////////////////////////////////////////////////////////////////////
    fun arDidNotFinishLoading(progress: Int) = companion.arDidNotFinishLoading(progress)
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region STATS
    // //////////////////////////////////////////////////////////////////////////
    fun statsTeam() = companion.statsTeam()
    fun statsTeamName() = companion.statsTeamName()
    fun statsRank() = companion.statsRank()
    fun statsSolved() = companion.statsSolved()
    fun statsNotSolved() = companion.statsNotSolved()
    fun statsAverage() = companion.statsAverage()
    fun statsProgress() = companion.statsProgress()
    fun statsUnfinished() = companion.statsUnfinished()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region STATISTIC
    // //////////////////////////////////////////////////////////////////////////
    fun statisticCompare() = companion.statisticCompare()
    fun statisticMyTeam() = companion.statisticMyTeam()
    fun statisticOtherTeam() = companion.statisticOtherTeam()
    fun statisticDistance() = companion.statisticDistance()
    fun statisticOpen() = companion.statisticOpen()
    fun statisticNoData() = companion.statisticNoData()
    fun statisticNoHighScore() = companion.statisticNoHighScore()
    fun statisticNoStatistic() = companion.statisticNoStatistic()
    fun statisticNotInHighScore() = companion.statisticNotInHighScore()
    fun statisticTeamNotInHighScore() = companion.statisticTeamNotInHighScore()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region OPERATOR
    // //////////////////////////////////////////////////////////////////////////
    fun `operator`() = companion.`operator`()
    fun operatorSend() = companion.operatorSend()
    fun operatorMe() = companion.operatorMe()
    fun operatorTitle() = companion.operatorTitle()
    fun operatorIsSending() = companion.operatorIsSending()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region CHAT
    // //////////////////////////////////////////////////////////////////////////
    fun chatActivated() = companion.chatActivated()
    fun chatActivatedLocal() = companion.chatActivatedLocal()
    fun chatAddChatroom() = companion.chatAddChatroom()
    fun chatAddChatroomAlreadyExists() = companion.chatAddChatroomAlreadyExists()
    fun chatAddName() = companion.chatAddName()
    fun chatAddRoomSelect() = companion.chatAddRoomSelect()
    fun chatAddSelect() = companion.chatAddSelect()
    fun chatConnecting() = companion.chatConnecting()
    fun chatCreate() = companion.chatCreate()
    fun chatDeactivated() = companion.chatDeactivated()
    fun chatDeactivatedLocal() = companion.chatDeactivatedLocal()
    fun chatDeactivatedText() = companion.chatDeactivatedText()
    fun chatEmpty() = companion.chatEmpty()
    fun chatEmptyDeactivated() = companion.chatEmptyDeactivated()
    fun chatLeave() = companion.chatLeave()
    fun chatLeaveSure() = companion.chatLeaveSure()
    fun chatNewMessage() = companion.chatNewMessage()
    fun chatRemoveChatroom() = companion.chatRemoveChatroom()
    fun chatRoomName() = companion.chatRoomName()
    fun chatUserAdded() = companion.chatUserAdded()
    fun chatUserAddedLocal() = companion.chatUserAddedLocal()
    fun chatUserLeft() = companion.chatUserLeft()
    fun chatUserLeftLocal() = companion.chatUserLeftLocal()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region PhotoUpload
    // //////////////////////////////////////////////////////////////////////////
    fun photoUploadError() = companion.photoUploadError()
    fun photoUploadSuccessful() = companion.photoUploadSuccessful()
    fun photoUploadSuccessfulGallery() = companion.photoUploadSuccessfulGallery()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region VideoUpload
    // //////////////////////////////////////////////////////////////////////////
    fun videoUploadError() = companion.videoUploadError()
    fun videoUploadSuccessful() = companion.videoUploadSuccessful()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region SETTINGS
    // //////////////////////////////////////////////////////////////////////////
    fun settingsMoreEvents() = companion.settingsMoreEvents()
    fun settingsPackAndGo() = companion.settingsPackAndGo()
    fun settingsLanguage() = companion.settingsLanguage()
    fun settingsDeviceInformation() = companion.settingsDeviceInformation()
    fun settingsLogout() = companion.settingsLogout()
    fun settingsNotSynchronized() = companion.settingsNotSynchronized()
    fun synchronizeAll() = companion.synchronizeAll()
    fun synchronizeAuthenticate() = companion.synchronizeAuthenticate()
    fun synchronizeChat(count: Int) = companion.synchronizeChat(count)
    fun synchronizeMedia(count: Int) = companion.synchronizeMedia(count)
    fun synchronizeSolutions(count: Int) = companion.synchronizeSolutions(count)
    fun synchronizeTitle() = companion.synchronizeTitle()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region LANGUAGES
    // //////////////////////////////////////////////////////////////////////////
    fun langEN() = companion.langEN()
    fun langDE() = companion.langDE()
    fun langBG() = companion.langBG()
    fun langCZ() = companion.langCZ()
    fun langDA() = companion.langDA()
    fun langES() = companion.langES()
    fun langFR() = companion.langFR()
    fun langHE() = companion.langHE()
    fun langHU() = companion.langHU()
    fun langIT() = companion.langIT()
    fun langNL() = companion.langNL()
    fun langNotAvailable() = companion.langNotAvailable()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region DEVICE INFORMATION
    // //////////////////////////////////////////////////////////////////////////
    fun deviceSystemVersion() = companion.deviceSystemVersion()
    fun deviceAppVersion() = companion.deviceAppVersion()
    fun deviceSynchronisation() = companion.deviceSynchronisation()
    fun deviceUnsend() = companion.deviceUnsend()
    fun deviceUnsendResults() = companion.deviceUnsendResults()
    fun deviceUnsendMedia() = companion.deviceUnsendMedia()
    fun deviceUnsendChat() = companion.deviceUnsendChat()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region USECASES
    // //////////////////////////////////////////////////////////////////////////
    fun loadMessageGetEventBranding() = companion.loadMessageGetEventBranding()
    fun loadMessageGetEventCoins() = companion.loadMessageGetEventCoins()
    fun loadMessageGetEventFiles() = companion.loadMessageGetEventFiles()
    fun loadMessageGetEventOffline() = companion.loadMessageGetEventOffline()
    fun loadMessageGetPlayerEvents() = companion.loadMessageGetPlayerEvents()
    fun loadMessageGetPlayer() = companion.loadMessageGetPlayer()
    fun loadMessageGetPlayerInfo() = companion.loadMessageGetPlayerInfo()
    fun loadMessageLogin() = companion.loadMessageLogin()
    fun loadMessageRegister() = companion.loadMessageRegister()
    fun loadMessageRequestPasswordReset() = companion.loadMessageRequestPasswordReset()
    fun loadMessageUpdateUser() = companion.loadMessageUpdateUser()
    fun loadMessageGetTasks() = companion.loadMessageGetTasks()
    fun loadMessageCheckInTask() = companion.loadMessageCheckInTask()
    fun loadMessageMediaGet() = companion.loadMessageMediaGet()
    fun loadMessageSolve() = companion.loadMessageSolve()
    fun loadMessageGetHighScore() = companion.loadMessageGetHighScore()
    fun loadMessageReadNewEvent() = companion.loadMessageReadNewEvent()
    fun loadMessageMediaUpload() = companion.loadMessageMediaUpload()
    fun loadMessageSetTeamEmail() = companion.loadMessageSetTeamEmail()
    fun loadMessageSetTeamName() = companion.loadMessageSetTeamName()
    fun loadMessageSetTeamParticipants() = companion.loadMessageSetTeamParticipants()
    fun loadMessageSetTeamPhoto()  = companion.loadMessageSetTeamPhoto()
    fun loadMessageUnpacking() = companion.loadMessageUnpacking()
    fun loadMessageUploadImage() = companion.loadMessageUploadImage()
    fun loadMessageUploadVideo() = companion.loadMessageUploadVideo()
    //endregion

    // //////////////////////////////////////////////////////////////////////////
    //region JSON Response error (codes), lookup using "error_code_"+errorCode
    // //////////////////////////////////////////////////////////////////////////
    fun anErrorOccurred() = companion.anErrorOccurred()
    fun errorAlertConnectionProblems() = companion.errorAlertConnectionProblems()
    fun errorAlertNoWritableSdcard() = companion.errorAlertNoWritableSdcard()
    fun errorCodeAlreadyExists() = companion.errorCodeAlreadyExists()
    fun errorCodeCantPlayAgain() = companion.errorCodeCantPlayAgain()
    fun errorCodeCombatSpotAlreadySolvedTitle() = companion.errorCodeCombatSpotAlreadySolvedTitle()
    fun errorCodeCombatSpotAlreadySolved() = companion.errorCodeCombatSpotAlreadySolved()
    fun errorCodeEmailAddressDotAtom() = companion.errorCodeEmailAddressDotAtom()
    fun errorCodeEmailAddressInvalidFormat() = companion.errorCodeEmailAddressInvalidFormat()
    fun errorCodeEmailAddressInvalidHostname() = companion.errorCodeEmailAddressInvalidHostname()
    fun errorCodeEmailAddressInvalidLocalPart() = companion.errorCodeEmailAddressInvalidLocalPart()
    fun errorCodeEmailAddressInvalidMxRecord() = companion.errorCodeEmailAddressInvalidMxRecord()
    fun errorCodeEmailAddressInvalidSegment() = companion.errorCodeEmailAddressInvalidSegment()
    fun errorCodeEmailAddressLengthExceeded() = companion.errorCodeEmailAddressLengthExceeded()
    fun errorCodeEmailAddressQuotedString() = companion.errorCodeEmailAddressQuotedString()
    fun errorCodeEmailExists() = companion.errorCodeEmailExists()
    fun errorCodeEmailUnknown() = companion.errorCodeEmailUnknown()
    fun errorCodeError() = companion.errorCodeError()
    fun errorCodeEventIsInactive() = companion.errorCodeEventIsInactive()
    fun errorCodeEventIsPaused() = companion.errorCodeEventIsPaused()
    fun errorCodeInvalidCredentials() = companion.errorCodeInvalidCredentials()
    fun errorCodeIsEmpty() = companion.errorCodeIsEmpty()
    fun errorCodeMaxPointsReached() = companion.errorCodeMaxPointsReached()
    fun errorCodeNoAccessForPhotographers() = companion.errorCodeNoAccessForPhotographers()
    fun errorCodeNoEventAccess() = companion.errorCodeNoEventAccess()
    fun errorCodeNoEventFound() = companion.errorCodeNoEventFound()
    fun errorCodeNoWaypointId() = companion.errorCodeNoWaypointId()
    fun errorCodeNoWaypointMatching() = companion.errorCodeNoWaypointMatching()
    fun errorCodeNotActive() = companion.errorCodeNotActive()
    fun errorCodeNotAlnum() = companion.errorCodeNotAlnum()
    fun errorCodeNotAlpha() = companion.errorCodeNotAlpha()
    fun errorCodeNotDigits() = companion.errorCodeNotDigits()
    fun errorCodeNotSame() = companion.errorCodeNotSame()
    fun errorCodeOutOfMemory() = companion.errorCodeOutOfMemory()
    fun errorCodePhoneNumberError() = companion.errorCodePhoneNumberError()
    fun errorCodeQrNotAllowedByEventOwner() = companion.errorCodeQrNotAllowedByEventOwner()
    fun errorCodeQrNotValid() = companion.errorCodeQrNotValid()
    fun errorCodeQrOverused() = companion.errorCodeQrOverused()
    fun errorCodeQrRequired() = companion.errorCodeQrRequired()
    fun errorCodeSolvingAsPhotographer() = companion.errorCodeSolvingAsPhotographer()
    fun errorCodeTeamIsPlayer() = companion.errorCodeTeamIsPlayer()
    fun errorCodeWaypointPassed() = companion.errorCodeWaypointPassed()
    fun noInternetConnection() = companion.noInternetConnection()
    fun noInternetConnectionOk() = companion.noInternetConnectionOk()
    fun noInternetConnectionTryAgain() = companion.noInternetConnectionTryAgain()
    fun waypointPassed() = companion.waypointPassed()

    fun operationNotAllowed() = companion.operationNotAllowed()
    fun eventErrorLoading() = companion.eventErrorLoading()
    fun msgTechnicalError() = companion.msgTechnicalError()
    //endregion
}

internal expect class LocalizationCompanion() {

    // VARIOUS
    fun agree(): String
    fun accept(): String
    fun attention(): String
    fun cancel(): String
    fun close(): String
    fun `continue`(): String
    fun done(): String
    fun dots(): String
    fun edit(): String
    fun end(): String
    fun exit(): String
    fun later(): String
    fun loading(): String
    fun more(): String
    fun next(): String
    fun no(): String
    fun ok(): String
    fun show(): String
    fun success(): String
    fun synchronize(): String
    fun tryAgain(): String
    fun version(): String
    fun yes(): String

    fun imprint(): String
    fun licenses(): String
    fun privacyPolicy(): String
    fun teamsAndConditions(): String

    // time
    fun days(count: Int): String
    fun hours(count: Int): String
    fun minutes(count: Int): String
    fun seconds(count: Int): String
    fun timeRemaining(): String
    fun timeCountdownTitle(): String

    // person
    fun city(): String
    fun female(): String
    fun firstname(): String
    fun gender(): String
    fun lastname(): String
    fun male(): String
    fun number(): String
    fun street(): String
    fun zipcode(): String

    // register
    fun registerTitle(): String
    fun registerBtn(): String
    fun registerMessage(): String
    fun registerUsername(): String
    fun registerEmail(): String
    fun registerPassword(): String
    fun registerPasswordConfirm(): String
    fun registerAccept(): String
    fun registerAcceptContinue(): String
    fun registerAcceptGTC(): String
    fun registerAcceptPP(): String
    fun registerGTC(): String
    fun registerPP(): String
    fun registerMemberNumber(): String
    fun registerMsgOk(): String

    // demo user dialog
    fun demoAlreadyUsed(): String
    fun demoAlreadyUsedDelete(): String
    fun demoQuestion(): String
    fun demoQuestionRetry(): String
    fun demoLoginUnauthorizedEvent(): String

    // login
    fun loginTitle(): String
    fun login(): String
    fun loginMessage(): String
    fun loginEmail(): String
    fun loginPassword(): String
    fun loginWithoutRegistration(): String

    // forgot password
    fun forgotPwRequest(): String
    fun forgotPwMessage(): String
    fun forgotPwAnswer(): String


    // EVENTS
    fun event(count: Int): String
    fun eventInLine(count: Int): String
    fun eventInLineWith(): String
    fun eventList(): String
    fun eventListInLine(): String
    fun eventNew(): String

    // EASY EVENT AND EVENT LIST
    fun easyEventMessage(): String
    fun easyEventContinue(): String
    fun easyEventAlternative(): String
    fun eventsActive(): String
    fun eventsExpired(): String
    fun eventsMy(): String
    fun eventsPublic(): String
    fun eventsPremium(): String
    fun eventsTimeLeft(): String
    fun eventsFree(): String
    fun eventChanged(): String

    // WelcomeDialog
    fun welcomeTeamTitle(): String
    fun welcomeTeamMessage(): String
    fun welcomeTeamPlaceholder(): String
    fun welcomeTeamError(): String
    fun welcomeParticipantsTitle(): String
    fun welcomeParticipantsMessage(): String
    fun welcomeParticipantsPlaceholder(): String
    fun welcomeParticipantsError(): String
    fun welcomeEmailTitle(): String
    fun welcomeEmailMessage(): String
    fun welcomeEmailPlaceholder(): String
    fun welcomeEmailError(): String
    fun welcomeDone(): String

    // MENU
    fun menuBriefing(): String
    fun menuChat(): String
    fun menuChatNewRoom(): String
    fun menuChatEditRoom(): String
    fun menuEmergency(): String
    fun menuHighScore(): String
    fun menuLogin(): String
    fun menuMap(): String
    fun menuOpCall(): String
    fun menuProfile(): String
    fun menuStatistics(): String
    fun menuTask(): String
    fun menuTaskList(): String
    fun menuTutorial(): String
    fun menuPhoto(): String
    fun menuQR(): String
    fun menuAR(): String
    fun menuPassword(): String

    // DEMO
    fun gameInfo(): String
    fun demoTitle(): String
    fun demoMessage(): String

    // SPECIAL
    fun dialogExitReally(): String
    fun dialogNewEventMessage(count: Int): String
    fun dialogNoMagnetSensorMessage(): String
    fun dialogNoMagnetSensorTitle(): String

    // GPS
    fun gpsContinue(): String
    fun gpsEnable(): String
    fun gpsNoSignal(): String
    fun gpsNotEnabled(): String

    // TASK and TASK LIST
    fun task(): String
    fun taskDistance(): String
    fun taskName(): String
    fun taskNr(): String
    fun taskPoints(): String
    fun taskTabSpot(nr: Int): String
    fun taskTaskName(): String
    fun taskTime(): String
    fun taskType(): String

    // QUEST DETAILS
    fun taskActive(): String
    fun taskActiveVoting(): String
    fun taskCheckin(): String
    fun taskDetail(): String
    fun taskSolution(): String
    fun taskEventNotActive(): String
    fun taskFailed(): String
    fun taskInactive(): String
    fun taskNotInRange(distance: Int): String
    fun taskPass(): String
    fun taskPassed(): String
    fun taskPictures(): String
    fun taskSolve(): String
    fun taskSolveVoting(): String
    fun taskSolved(): String
    fun taskSolvedVoting(): String
    fun taskTooFar(distance: Int): String

    // Password Dialog
    fun passwordEnter(): String
    fun passwordWrong(): String

    // SOLUTION Dialog
    fun solveCorrectSolution(): String
    fun solveCorrectVoting(): String
    fun solveMcEmpty(): String
    fun solveMcFull(maxAnswers: Int): String
    fun solveMcMissingAnswers(missing: Int): String
    fun solveMcMissingAnswerExact(): String
    fun solveTextEmpty(): String
    fun solveTextEmptyVoting(): String
    fun solveTitle(): String
    fun solveVotingEmptyDialog(): String
    fun solveVotingMissingMinVote(maxVotes: Int): String
    fun solveVotingMissingStars(count: Int): String
    fun solveVotingMissingVotes(count: Int): String
    fun solveVotingStarsFull(maxVotes: Int): String
    fun solveVotingVotesFull(maxVotes: Int): String
    fun solveWrongSolution(): String

    // SOLVE CONTROLLER
    fun correctWas(): String
    fun correctWasMedia(): String
    fun triesLeft(count: Int): String
    fun triesLeftMany(): String

    // QR CODE
    fun qrAnotherQr(): String
    fun qrTaskNotFound(): String

    // AR
    fun arDidNotFinishLoading(progress: Int): String

    // STATS
    fun statsTeam(): String
    fun statsTeamName(): String
    fun statsRank(): String
    fun statsSolved(): String
    fun statsNotSolved(): String
    fun statsAverage(): String
    fun statsProgress(): String
    fun statsUnfinished(): String

    // STATISTIC
    fun statisticCompare(): String
    fun statisticMyTeam(): String
    fun statisticOtherTeam(): String
    fun statisticDistance(): String
    fun statisticOpen(): String
    fun statisticNoData(): String
    fun statisticNoHighScore(): String
    fun statisticNoStatistic(): String
    fun statisticNotInHighScore(): String
    fun statisticTeamNotInHighScore(): String

    // OPERATOR
    fun `operator`(): String
    fun operatorSend(): String
    fun operatorMe(): String
    fun operatorTitle(): String
    fun operatorIsSending(): String

    // CHAT
    fun chatActivated(): String
    fun chatActivatedLocal(): String
    fun chatAddChatroom(): String
    fun chatAddChatroomAlreadyExists(): String
    fun chatAddName(): String
    fun chatAddRoomSelect(): String
    fun chatAddSelect(): String
    fun chatConnecting(): String
    fun chatCreate(): String
    fun chatDeactivated(): String
    fun chatDeactivatedLocal(): String
    fun chatDeactivatedText(): String
    fun chatEmpty(): String
    fun chatEmptyDeactivated(): String
    fun chatLeave(): String
    fun chatLeaveSure(): String
    fun chatNewMessage(): String
    fun chatRemoveChatroom(): String
    fun chatRoomName(): String
    fun chatUserAdded(): String
    fun chatUserAddedLocal(): String
    fun chatUserLeft(): String
    fun chatUserLeftLocal(): String

    // PhotoUpload
    fun photoUploadError(): String
    fun photoUploadSuccessful(): String
    fun photoUploadSuccessfulGallery(): String

    // VideoUpload
    fun videoUploadError(): String
    fun videoUploadSuccessful(): String

    // SETTINGS
    fun settingsMoreEvents(): String
    fun settingsPackAndGo(): String
    fun settingsLanguage(): String
    fun settingsDeviceInformation(): String
    fun settingsLogout(): String
    fun settingsNotSynchronized(): String
    fun synchronizeAll(): String
    fun synchronizeAuthenticate(): String
    fun synchronizeChat(count: Int): String
    fun synchronizeMedia(count: Int): String
    fun synchronizeSolutions(count: Int): String
    fun synchronizeTitle(): String

    // LANGUAGES
    fun langEN(): String
    fun langDE(): String
    fun langBG(): String
    fun langCZ(): String
    fun langDA(): String
    fun langES(): String
    fun langFR(): String
    fun langHE(): String
    fun langHU(): String
    fun langIT(): String
    fun langNL(): String
    fun langNotAvailable(): String

    // DEVICE INFORMATION
    fun deviceSystemVersion(): String
    fun deviceAppVersion(): String
    fun deviceSynchronisation(): String
    fun deviceUnsend(): String
    fun deviceUnsendResults(): String
    fun deviceUnsendMedia(): String
    fun deviceUnsendChat(): String

    // USECASES
    fun loadMessageGetEventBranding(): String
    fun loadMessageGetEventCoins(): String
    fun loadMessageGetEventFiles(): String
    fun loadMessageGetEventOffline(): String
    fun loadMessageGetPlayerEvents(): String
    fun loadMessageGetPlayer(): String
    fun loadMessageGetPlayerInfo(): String
    fun loadMessageLogin(): String
    fun loadMessageRegister(): String
    fun loadMessageRequestPasswordReset(): String
    fun loadMessageUpdateUser(): String
    fun loadMessageGetTasks(): String
    fun loadMessageCheckInTask(): String
    fun loadMessageMediaGet(): String
    fun loadMessageSolve(): String
    fun loadMessageGetHighScore(): String
    fun loadMessageReadNewEvent(): String
    fun loadMessageMediaUpload(): String
    fun loadMessageSetTeamEmail(): String
    fun loadMessageSetTeamName(): String
    fun loadMessageSetTeamParticipants(): String
    fun loadMessageSetTeamPhoto(): String
    fun loadMessageUnpacking(): String
    fun loadMessageUploadImage(): String
    fun loadMessageUploadVideo(): String

    // JSON Response error (codes), lookup using "error_code_"+errorCode
    fun anErrorOccurred(): String
    fun errorAlertConnectionProblems(): String
    fun errorAlertNoWritableSdcard(): String
    fun errorCodeAlreadyExists(): String
    fun errorCodeCantPlayAgain(): String
    fun errorCodeCombatSpotAlreadySolvedTitle(): String
    fun errorCodeCombatSpotAlreadySolved(): String
    fun errorCodeEmailAddressDotAtom(): String
    fun errorCodeEmailAddressInvalidFormat(): String
    fun errorCodeEmailAddressInvalidHostname(): String
    fun errorCodeEmailAddressInvalidLocalPart(): String
    fun errorCodeEmailAddressInvalidMxRecord(): String
    fun errorCodeEmailAddressInvalidSegment(): String
    fun errorCodeEmailAddressLengthExceeded(): String
    fun errorCodeEmailAddressQuotedString(): String
    fun errorCodeEmailExists(): String
    fun errorCodeEmailUnknown(): String
    fun errorCodeError(): String
    fun errorCodeEventIsInactive(): String
    fun errorCodeEventIsPaused(): String
    fun errorCodeInvalidCredentials(): String
    fun errorCodeIsEmpty(): String
    fun errorCodeMaxPointsReached(): String
    fun errorCodeNoAccessForPhotographers(): String
    fun errorCodeNoEventAccess(): String
    fun errorCodeNoEventFound(): String
    fun errorCodeNoWaypointId(): String
    fun errorCodeNoWaypointMatching(): String
    fun errorCodeNotActive(): String
    fun errorCodeNotAlnum(): String
    fun errorCodeNotAlpha(): String
    fun errorCodeNotDigits(): String
    fun errorCodeNotSame(): String
    fun errorCodeOutOfMemory(): String
    fun errorCodePhoneNumberError(): String
    fun errorCodeQrNotAllowedByEventOwner(): String
    fun errorCodeQrNotValid(): String
    fun errorCodeQrOverused(): String
    fun errorCodeQrRequired(): String
    fun errorCodeSolvingAsPhotographer(): String
    fun errorCodeTeamIsPlayer(): String
    fun errorCodeWaypointPassed(): String
    fun noInternetConnection(): String
    fun noInternetConnectionOk(): String
    fun noInternetConnectionTryAgain(): String
    fun waypointPassed(): String
    fun operationNotAllowed(): String
    fun eventErrorLoading(): String
    fun msgTechnicalError(): String
}