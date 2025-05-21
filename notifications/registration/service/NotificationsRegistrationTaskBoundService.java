package com.google.android.gms.notifications.registration.service;

import com.google.android.gms.chimera.modules.notifications.registration.AppContextProvider;
import defpackage.arfc;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqpn;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bykx;
import defpackage.byky;
import defpackage.csbm;
import defpackage.eijr;
import defpackage.fqob;
import defpackage.fuyx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NotificationsRegistrationTaskBoundService extends Pommel_NotificationsRegistrationTaskBoundService {
    public static final asot a = asot.b("NotificationsModuleTaskBoundService", asej.NOTIFICATIONS_REGISTRATION);
    public static final byky b = bykx.a(0, (int) fqob.a.a().c(), (int) fqob.a.a().d());
    public csbm c;
    private final fuyx d;
    private final bqqa e;

    public NotificationsRegistrationTaskBoundService() {
        fuyx fuyxVar = bqpn.a;
        this.d = bqpn.b;
        if (AppContextProvider.c == null) {
            arfc.a();
        }
        eijr eijrVar = bqqe.a;
        this.e = new bqqa();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r4) {
        /*
            r3 = this;
            fqob r0 = defpackage.fqob.a
            fqoc r0 = r0.a()
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
            fcuj r4 = defpackage.fcuj.APP_BLOCK_STATE_CHANGED
            goto L74
        L27:
            java.lang.String r0 = "RE_REGISTER_TIMEZONE_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.TIMEZONE_CHANGED
            goto L74
        L32:
            java.lang.String r0 = "RE_REGISTER_APP_UPDATE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.APP_UPDATED
            goto L74
        L3d:
            java.lang.String r0 = "RE_REGISTER_REGISTRATION_ID_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.REGISTRATION_ID_CHANGED
            goto L74
        L48:
            java.lang.String r0 = "REGISTER_CHIME_GMS_ACCOUNTS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.PERIODIC_REGISTRATION
            goto L74
        L53:
            java.lang.String r0 = "RE_REGISTER_LOCALE_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.LOCALE_CHANGED
            goto L74
        L5e:
            java.lang.String r0 = "RE_REGISTER_ACCOUNTS_CHANGE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L95
            fcuj r4 = defpackage.fcuj.ACCOUNT_CHANGED
            goto L74
        L69:
            java.lang.String r0 = "RE_REGISTER_CHANNEL_BLOCK_STATE"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L72
            goto L95
        L72:
            fcuj r4 = defpackage.fcuj.CHANNEL_BLOCK_STATE_CHANGED
        L74:
            int r0 = r4.ordinal()
            r1 = 13
            if (r0 == r1) goto L7f
            aseu r0 = defpackage.aseu.NOTIFICATIONS_REGISTRATION_EVENT_BASED
            goto L81
        L7f:
            aseu r0 = defpackage.aseu.NOTIFICATIONS_REGISTRATION_PERIODIC
        L81:
            defpackage.bqqa.a(r0)
            fuyx r0 = r3.d
            fvic r0 = defpackage.fvid.b(r0)
            csdu r1 = new csdu
            r2 = 0
            r1.<init>(r4, r3, r2)
            enss r4 = defpackage.fvug.e(r0, r1)
            return r4
        L95:
            asot r0 = com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.a
            ejgq r0 = r0.j()
            ejhf r0 = (defpackage.ejhf) r0
            java.lang.String r2 = "Will not register accounts to Chime, received unknown tag %s."
            r0.B(r2, r4)
            enss r4 = defpackage.ensj.i(r1)
            return r4
        La7:
            asot r4 = com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.a
            ejgq r4 = r4.j()
            ejhf r4 = (defpackage.ejhf) r4
            java.lang.String r0 = "Will not register accounts to Chime, enable_direct_registrations flag is off."
            r4.x(r0)
            enss r4 = defpackage.ensj.i(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.registration.service.NotificationsRegistrationTaskBoundService.im(byln):enss");
    }
}
