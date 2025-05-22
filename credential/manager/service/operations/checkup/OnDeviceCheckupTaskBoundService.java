package com.google.android.gms.credential.manager.service.operations.checkup;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.service.operations.checkup.OnDeviceCheckupTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aued;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.ayyg;
import defpackage.azck;
import defpackage.azee;
import defpackage.cauf;
import defpackage.dhkz;
import defpackage.dhmr;
import defpackage.dqmr;
import defpackage.ekut;
import defpackage.eles;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OnDeviceCheckupTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("OnDeviceCheckupTaskBoundService", auid.CREDENTIAL_MANAGER);
    private ayyg c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        String str = caufVar.a;
        Context applicationContext = getApplicationContext();
        if (!"PeriodicOnDeviceCheckup".equals(str)) {
            ((eluo) b.j()).B("Unknown tag: %s, do not run on device checkup.", str);
            return eqgc.i(2);
        }
        if (this.c == null) {
            this.c = new ayyg(applicationContext, new azee(applicationContext), new azck(applicationContext, aued.f(applicationContext)));
        }
        final ayyg ayygVar = this.c;
        Context context = ayygVar.a;
        final elgo n = eles.j(auqx.h(context, context.getPackageName())).l(new ekut() { // from class: ayye
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                Account account = (Account) obj;
                final CredentialManagerAccount a2 = CredentialManagerAccount.a(account.name);
                final axbx axbxVar = new axbx(new axbq(account.name, buki.v()));
                atfn atfnVar = new atfn();
                atfnVar.d = 26801;
                atfnVar.a = new atfd() { // from class: azeb
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        azef azefVar = (azef) obj2;
                        int i = azee.a;
                        ((azdz) azefVar.H()).c(new awhd((dhma) obj3), new CredentialManagerInvocationParams(CredentialManagerAccount.this, null), bsxa.a(azefVar.r));
                    }
                };
                atfo a3 = atfnVar.a();
                final ayyg ayygVar2 = ayyg.this;
                return ((atad) ayygVar2.b).jd(a3).d(new dhkz() { // from class: ayyc
                    @Override // defpackage.dhkz
                    public final Object a(dhlw dhlwVar) {
                        aued auedVar;
                        if (dhlwVar.h() != null || dhlwVar.i() == null) {
                            return dhmr.d(awhf.CHECKUP_ERROR);
                        }
                        CredentialManagerAccount credentialManagerAccount = a2;
                        awhf awhfVar = (awhf) dhlwVar.i();
                        boolean b2 = credentialManagerAccount.b();
                        if (!awhfVar.equals(awhf.CHECKUP_COMPLETED_NEW_ISSUES_FOUND) || !b2) {
                            return dhmr.d(awhfVar);
                        }
                        final ayyg ayygVar3 = ayyg.this;
                        if (auub.a() && ((auedVar = ayygVar3.c.c) == null || !auedVar.x())) {
                            return dhmr.d(awhf.CHECKUP_COMPLETED_NEW_ISSUES_FOUND_ALERT_OPTED_OUT);
                        }
                        final String str2 = credentialManagerAccount.a;
                        Object obj2 = ayygVar3.b;
                        final int a4 = azck.a(str2);
                        final CredentialManagerAccount a5 = CredentialManagerAccount.a(str2);
                        atfn atfnVar2 = new atfn();
                        atfnVar2.d = 26802;
                        atfnVar2.a = new atfd() { // from class: azea
                            @Override // defpackage.atfd
                            public final void d(Object obj3, Object obj4) {
                                azef azefVar = (azef) obj3;
                                int i = azee.a;
                                ((azdz) azefVar.H()).a(new awgx((dhma) obj4), new CredentialManagerInvocationParams(CredentialManagerAccount.this, null), a4, bsxa.a(azefVar.r));
                            }
                        };
                        return ((atad) obj2).jd(atfnVar2.a()).d(new dhkz() { // from class: ayya
                            @Override // defpackage.dhkz
                            public final Object a(dhlw dhlwVar2) {
                                awhf awhfVar2;
                                String group;
                                if (dhlwVar2.h() != null || dhlwVar2.i() == null) {
                                    return dhmr.d(awhf.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR);
                                }
                                ayyg ayygVar4 = ayyg.this;
                                PendingIntent pendingIntent = (PendingIntent) dhlwVar2.i();
                                azck azckVar = ayygVar4.c;
                                aued auedVar2 = azckVar.c;
                                if (auedVar2 == null) {
                                    awhfVar2 = awhf.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR;
                                } else {
                                    if (auub.c()) {
                                        if (fpzk.c()) {
                                            azbt.a(auedVar2, azckVar.a);
                                            NotificationChannel c = auedVar2.c("com.google.android.gms.notifications::SECURITY_ALERTS");
                                            if (c == null) {
                                                NotificationChannel notificationChannel = new NotificationChannel("com.google.android.gms.notifications::SECURITY_ALERTS", "Security Alerts", 3);
                                                notificationChannel.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                                                auedVar2.p(notificationChannel);
                                            } else {
                                                group = c.getGroup();
                                                if (group == null) {
                                                    c.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                                                }
                                            }
                                        } else if (auedVar2.c("com.google.android.gms.notifications::SECURITY_ALERTS") == null) {
                                            auedVar2.p(new NotificationChannel("com.google.android.gms.notifications::SECURITY_ALERTS", "Security Alerts", 3));
                                        }
                                    }
                                    int i = a4;
                                    String str3 = str2;
                                    Resources resources = azckVar.b;
                                    Context context2 = azckVar.a;
                                    String string = resources.getString(R.string.pwm_on_device_checkup_alert_title);
                                    String string2 = resources.getString(R.string.pwm_on_device_checkup_alert_description);
                                    int a6 = apzg.a(context2, android.R.drawable.ic_dialog_alert);
                                    ilt iltVar = new ilt(context2, "com.google.android.gms.notifications::SECURITY_ALERTS");
                                    iltVar.r(string);
                                    iltVar.j(string2);
                                    iltVar.g = pendingIntent;
                                    iltVar.i(true);
                                    iltVar.l = 0;
                                    iltVar.n(a6);
                                    iltVar.B = 1;
                                    iltVar.p(str3);
                                    auedVar2.w("password_checkup_alerts_notification_tag", i, dhpk.ON_DEVICE_PROACTIVE_PASSWORD_CHECKUP, iltVar.b());
                                    awhfVar2 = awhf.CHECKUP_COMPLETED_NEW_ISSUES_FOUND;
                                }
                                return dhmr.d(awhfVar2);
                            }
                        });
                    }
                }).d(new dhkz() { // from class: ayyd
                    @Override // defpackage.dhkz
                    public final Object a(dhlw dhlwVar) {
                        awhf awhfVar = (awhf) dhlwVar.i();
                        euxc euxcVar = euxc.CHECKUP_ANDROID_ON_DEVICE;
                        int ordinal = awhfVar.ordinal();
                        axbx axbxVar2 = axbx.this;
                        if (ordinal == 1) {
                            axbxVar2.a(euwz.PWM_ON_DEVICE_CHECKUP_SUCCESS_NEW_ISSUES_FOUND, euxcVar);
                            return dhlwVar;
                        }
                        if (ordinal == 2) {
                            axbxVar2.a(euwz.PWM_ON_DEVICE_CHECKUP_SUCCESS_NEW_ISSUES_FOUND_ALERT_OPTED_OUT, euxcVar);
                            return dhlwVar;
                        }
                        if (ordinal == 3) {
                            axbxVar2.a(euwz.PWM_ON_DEVICE_CHECKUP_SUCCESS_NO_NEW_ISSUES_FOUND, euxcVar);
                            return dhlwVar;
                        }
                        if (ordinal != 5) {
                            return dhlwVar;
                        }
                        axbxVar2.a(euwz.PWM_ON_DEVICE_CHECKUP_SUCCESS_NOTIFICATIONS_ERROR, euxcVar);
                        return dhlwVar;
                    }
                });
            }
        }).n();
        return eqdl.f(dqmr.b(dhmr.e(n).b(new dhkz() { // from class: ayyf
            @Override // defpackage.dhkz
            public final Object a(dhlw dhlwVar) {
                return eles.j(elgo.this).l(new ekut() { // from class: ayyb
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        return (awhf) ((dhlw) obj).i();
                    }
                }).p();
            }
        })), new ekut() { // from class: ayyh
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                elhz elhzVar = (elhz) obj;
                int i = OnDeviceCheckupTaskBoundService.a;
                return Integer.valueOf(elhzVar.contains(awhf.CHECKUP_ERROR) ? 1 : elhzVar.contains(awhf.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR) ? 2 : 0);
            }
        }, eqex.a);
    }
}
