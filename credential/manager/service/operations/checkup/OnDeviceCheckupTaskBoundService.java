package com.google.android.gms.credential.manager.service.operations.checkup;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import com.google.android.gms.credential.manager.service.operations.checkup.OnDeviceCheckupTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.awug;
import defpackage.awyk;
import defpackage.axae;
import defpackage.byln;
import defpackage.dezt;
import defpackage.dfbl;
import defpackage.doci;
import defpackage.eiho;
import defpackage.eirn;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class OnDeviceCheckupTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("OnDeviceCheckupTaskBoundService", asej.CREDENTIAL_MANAGER);
    private awug c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        String str = bylnVar.a;
        Context applicationContext = getApplicationContext();
        if (!"PeriodicOnDeviceCheckup".equals(str)) {
            ((ejhf) b.j()).B("Unknown tag: %s, do not run on device checkup.", str);
            return ensj.i(2);
        }
        if (this.c == null) {
            this.c = new awug(applicationContext, new axae(applicationContext), new awyk(applicationContext, asbo.f(applicationContext)));
        }
        final awug awugVar = this.c;
        Context context = awugVar.a;
        final eitj n = eirn.j(asnd.h(context, context.getPackageName())).l(new eiho() { // from class: awue
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                Account account = (Account) obj;
                final CredentialManagerAccount a2 = CredentialManagerAccount.a(account.name);
                final auxy auxyVar = new auxy(new auxr(account.name, bsck.v()));
                arcy arcyVar = new arcy();
                arcyVar.d = 26801;
                arcyVar.a = new arco() { // from class: axab
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        axaf axafVar = (axaf) obj2;
                        int i = axae.a;
                        awzz awzzVar = (awzz) axafVar.H();
                        aucy aucyVar = new aucy((dfau) obj3);
                        CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, null);
                        Context context2 = axafVar.r;
                        awzzVar.c(aucyVar, credentialManagerInvocationParams, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                    }
                };
                arcz a3 = arcyVar.a();
                final awug awugVar2 = awug.this;
                return ((aqxo) awugVar2.b).iO(a3).d(new dezt() { // from class: awuc
                    @Override // defpackage.dezt
                    public final Object a(dfaq dfaqVar) {
                        asbo asboVar;
                        if (dfaqVar.h() != null || dfaqVar.i() == null) {
                            return dfbl.d(auda.CHECKUP_ERROR);
                        }
                        CredentialManagerAccount credentialManagerAccount = a2;
                        auda audaVar = (auda) dfaqVar.i();
                        boolean b2 = credentialManagerAccount.b();
                        if (!audaVar.equals(auda.CHECKUP_COMPLETED_NEW_ISSUES_FOUND) || !b2) {
                            return dfbl.d(audaVar);
                        }
                        final awug awugVar3 = awug.this;
                        if (asqh.a() && ((asboVar = awugVar3.c.c) == null || !asboVar.x())) {
                            return dfbl.d(auda.CHECKUP_COMPLETED_NEW_ISSUES_FOUND_ALERT_OPTED_OUT);
                        }
                        final String str2 = credentialManagerAccount.a;
                        Object obj2 = awugVar3.b;
                        final int a4 = awyk.a(str2);
                        final CredentialManagerAccount a5 = CredentialManagerAccount.a(str2);
                        arcy arcyVar2 = new arcy();
                        arcyVar2.d = 26802;
                        arcyVar2.a = new arco() { // from class: axaa
                            @Override // defpackage.arco
                            public final void d(Object obj3, Object obj4) {
                                axaf axafVar = (axaf) obj3;
                                int i = axae.a;
                                awzz awzzVar = (awzz) axafVar.H();
                                aucs aucsVar = new aucs((dfau) obj4);
                                CredentialManagerInvocationParams credentialManagerInvocationParams = new CredentialManagerInvocationParams(CredentialManagerAccount.this, null);
                                Context context2 = axafVar.r;
                                awzzVar.a(aucsVar, credentialManagerInvocationParams, a4, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                            }
                        };
                        return ((aqxo) obj2).iO(arcyVar2.a()).d(new dezt() { // from class: awua
                            @Override // defpackage.dezt
                            public final Object a(dfaq dfaqVar2) {
                                auda audaVar2;
                                String group;
                                if (dfaqVar2.h() != null || dfaqVar2.i() == null) {
                                    return dfbl.d(auda.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR);
                                }
                                awug awugVar4 = awug.this;
                                PendingIntent pendingIntent = (PendingIntent) dfaqVar2.i();
                                awyk awykVar = awugVar4.c;
                                asbo asboVar2 = awykVar.c;
                                if (asboVar2 == null) {
                                    audaVar2 = auda.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR;
                                } else {
                                    if (asqh.c()) {
                                        if (fnhk.c()) {
                                            awxt.a(asboVar2, awykVar.a);
                                            NotificationChannel c = asboVar2.c("com.google.android.gms.notifications::SECURITY_ALERTS");
                                            if (c == null) {
                                                NotificationChannel notificationChannel = new NotificationChannel("com.google.android.gms.notifications::SECURITY_ALERTS", "Security Alerts", 3);
                                                notificationChannel.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                                                asboVar2.p(notificationChannel);
                                            } else {
                                                group = c.getGroup();
                                                if (group == null) {
                                                    c.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                                                }
                                            }
                                        } else if (asboVar2.c("com.google.android.gms.notifications::SECURITY_ALERTS") == null) {
                                            asboVar2.p(new NotificationChannel("com.google.android.gms.notifications::SECURITY_ALERTS", "Security Alerts", 3));
                                        }
                                    }
                                    int i = a4;
                                    String str3 = str2;
                                    Resources resources = awykVar.b;
                                    Context context2 = awykVar.a;
                                    String string = resources.getString(R.string.pwm_on_device_checkup_alert_title);
                                    String string2 = resources.getString(R.string.pwm_on_device_checkup_alert_description);
                                    int a6 = anxo.a(context2, android.R.drawable.ic_dialog_alert);
                                    ikd ikdVar = new ikd(context2, "com.google.android.gms.notifications::SECURITY_ALERTS");
                                    ikdVar.m(string);
                                    ikdVar.l(string2);
                                    ikdVar.g = pendingIntent;
                                    ikdVar.k(true);
                                    ikdVar.l = 0;
                                    ikdVar.g(a6);
                                    ikdVar.z();
                                    ikdVar.w(str3);
                                    asboVar2.w("password_checkup_alerts_notification_tag", i, dfee.ON_DEVICE_PROACTIVE_PASSWORD_CHECKUP, ikdVar.b());
                                    audaVar2 = auda.CHECKUP_COMPLETED_NEW_ISSUES_FOUND;
                                }
                                return dfbl.d(audaVar2);
                            }
                        });
                    }
                }).d(new dezt() { // from class: awud
                    @Override // defpackage.dezt
                    public final Object a(dfaq dfaqVar) {
                        auda audaVar = (auda) dfaqVar.i();
                        eshn eshnVar = eshn.CHECKUP_ANDROID_ON_DEVICE;
                        int ordinal = audaVar.ordinal();
                        auxy auxyVar2 = auxy.this;
                        if (ordinal == 1) {
                            auxyVar2.a(eshk.PWM_ON_DEVICE_CHECKUP_SUCCESS_NEW_ISSUES_FOUND, eshnVar);
                            return dfaqVar;
                        }
                        if (ordinal == 2) {
                            auxyVar2.a(eshk.PWM_ON_DEVICE_CHECKUP_SUCCESS_NEW_ISSUES_FOUND_ALERT_OPTED_OUT, eshnVar);
                            return dfaqVar;
                        }
                        if (ordinal == 3) {
                            auxyVar2.a(eshk.PWM_ON_DEVICE_CHECKUP_SUCCESS_NO_NEW_ISSUES_FOUND, eshnVar);
                            return dfaqVar;
                        }
                        if (ordinal != 5) {
                            return dfaqVar;
                        }
                        auxyVar2.a(eshk.PWM_ON_DEVICE_CHECKUP_SUCCESS_NOTIFICATIONS_ERROR, eshnVar);
                        return dfaqVar;
                    }
                });
            }
        }).n();
        return enps.f(doci.b(dfbl.e(n).b(new dezt() { // from class: awuf
            @Override // defpackage.dezt
            public final Object a(dfaq dfaqVar) {
                return eirn.j(eitj.this).l(new eiho() { // from class: awub
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        return (auda) ((dfaq) obj).i();
                    }
                }).p();
            }
        })), new eiho() { // from class: awuh
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                eiuu eiuuVar = (eiuu) obj;
                int i = OnDeviceCheckupTaskBoundService.a;
                return Integer.valueOf(eiuuVar.contains(auda.CHECKUP_ERROR) ? 1 : eiuuVar.contains(auda.CHECKUP_COMPLETED_NOTIFICATIONS_ERROR) ? 2 : 0);
            }
        }, enre.a);
    }
}
