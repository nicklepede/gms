package com.google.android.gms.notifications.registration.service;

import com.google.android.gms.chimera.modules.notifications.registration.AppContextProvider;
import defpackage.athr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsxe;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.catp;
import defpackage.catq;
import defpackage.cukr;
import defpackage.ekww;
import defpackage.fthx;
import defpackage.fxuv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationTaskBoundService extends Pommel_NotificationsRegistrationTaskBoundService {
    public static final ausn a = ausn.b("NotificationsModuleTaskBoundService", auid.NOTIFICATIONS_REGISTRATION);
    public static final catq b = catp.a(0, (int) fthx.a.lK().c(), (int) fthx.a.lK().d());
    public cukr c;
    private final fxuv d;
    private final bsxr e;

    public NotificationsRegistrationTaskBoundService() {
        fxuv fxuvVar = bsxe.a;
        this.d = bsxe.b;
        if (AppContextProvider.c == null) {
            athr.a();
        }
        ekww ekwwVar = bsxv.a;
        this.e = new bsxr();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r4) {
        /*
            r3 = this;
            fthx r0 = defpackage.fthx.a
            fthy r0 = r0.lK()
            boolean r0 = r0.h()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto La7
            java.lang.String r4 = r4.a
            int r0 = r4.hashCode()
            switch(r0) {
                case -1959161933: goto L69;
                case -1463455463: goto L5e;
                case 232303653: goto L53;
                case 790408471: goto L48;
                case 1034861150: goto L3d;
                case 1210178519: goto L32;
                case 1480898982: goto L27;
                case 1849933777: goto L1c;
                default: goto L1a;
            }
        L1a:
            goto L95
        L1c:
            java.lang.String r0 = "RE_REGISTER_APP_BLOCK_STATE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.APP_BLOCK_STATE_CHANGED
            goto L74
        L27:
            java.lang.String r0 = "RE_REGISTER_TIMEZONE_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.TIMEZONE_CHANGED
            goto L74
        L32:
            java.lang.String r0 = "RE_REGISTER_APP_UPDATE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.APP_UPDATED
            goto L74
        L3d:
            java.lang.String r0 = "RE_REGISTER_REGISTRATION_ID_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.REGISTRATION_ID_CHANGED
            goto L74
        L48:
            java.lang.String r0 = "REGISTER_CHIME_GMS_ACCOUNTS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.PERIODIC_REGISTRATION
            goto L74
        L53:
            java.lang.String r0 = "RE_REGISTER_LOCALE_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.LOCALE_CHANGED
            goto L74
        L5e:
            java.lang.String r0 = "RE_REGISTER_ACCOUNTS_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            ffja r4 = defpackage.ffja.ACCOUNT_CHANGED
            goto L74
        L69:
            java.lang.String r0 = "RE_REGISTER_CHANNEL_BLOCK_STATE"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L72
            goto L95
        L72:
            ffja r4 = defpackage.ffja.CHANNEL_BLOCK_STATE_CHANGED
        L74:
            int r0 = r4.ordinal()
            r1 = 13
            if (r0 == r1) goto L7f
            auio r0 = defpackage.auio.NOTIFICATIONS_REGISTRATION_EVENT_BASED
            goto L81
        L7f:
            auio r0 = defpackage.auio.NOTIFICATIONS_REGISTRATION_PERIODIC
        L81:
            defpackage.bsxr.a(r0)
            fxuv r0 = r3.d
            fyea r0 = defpackage.fyeb.b(r0)
            cumz r1 = new cumz
            r2 = 0
            r1.<init>(r4, r3, r2)
            eqgl r4 = defpackage.fyqe.d(r0, r1)
            return r4
        L95:
            ausn r0 = com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.a
            eltz r0 = r0.j()
            eluo r0 = (defpackage.eluo) r0
            java.lang.String r2 = "Will not register accounts to Chime, received unknown tag %s."
            r0.B(r2, r4)
            eqgl r4 = defpackage.eqgc.i(r1)
            return r4
        La7:
            ausn r4 = com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.a
            eltz r4 = r4.j()
            eluo r4 = (defpackage.eluo) r4
            java.lang.String r0 = "Will not register accounts to Chime, enable_direct_registrations flag is off."
            r4.x(r0)
            eqgl r4 = defpackage.eqgc.i(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.iB(cauf):eqgl");
    }
}
