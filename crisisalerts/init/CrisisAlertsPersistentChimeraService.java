package com.google.android.gms.crisisalerts.init;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import com.google.android.gms.R;
import defpackage.asbo;
import defpackage.asng;
import defpackage.asnv;
import defpackage.asot;
import defpackage.asqh;
import defpackage.axbc;
import defpackage.axcw;
import defpackage.axdg;
import defpackage.axdv;
import defpackage.axdw;
import defpackage.axdz;
import defpackage.axef;
import defpackage.axeg;
import defpackage.axej;
import defpackage.axeo;
import defpackage.axfb;
import defpackage.axhe;
import defpackage.axhh;
import defpackage.dzbh;
import defpackage.dzbj;
import defpackage.eask;
import defpackage.easm;
import defpackage.easo;
import defpackage.eatn;
import defpackage.eato;
import defpackage.eatq;
import defpackage.eaua;
import defpackage.eauf;
import defpackage.eauh;
import defpackage.ewwi;
import defpackage.fnhq;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsPersistentChimeraService extends axcw {
    public static final asot a = axdg.a("PS");
    public axdw b;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        axeg axegVar;
        printWriter.println("##CRiAl Start");
        axdw axdwVar = this.b;
        Object obj = axdwVar.b;
        if (obj == null) {
            obj = "n/a";
        }
        printWriter.println(obj);
        if (fnhq.f() && (axegVar = axdwVar.c) != null) {
            eaua eauaVar = axegVar.g;
            if (eauaVar != null) {
                eauaVar.b(printWriter);
            }
            axegVar.j.a(printWriter);
        }
        printWriter.println("##CRiAl End");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.axcw, com.google.android.chimera.Service
    public final void onCreate() {
        asbo f;
        super.onCreate();
        axdw axdwVar = this.b;
        if (axdwVar.a.compareAndSet(false, true)) {
            axhh axhhVar = axdwVar.b;
            if (axhhVar.b()) {
                int i = true != axhhVar.c() ? 2 : 1;
                asng.M("com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingInjectorService", i);
                asng.M("com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsActivity", i);
                asng.M("com.google.android.gms.crisisalerts.GcmReceiverService", true != axhhVar.a() ? 2 : 1);
                if (axhhVar.d()) {
                    int i2 = axbc.a;
                    if (asqh.c() && asqh.c() && (f = asbo.f(this)) != null) {
                        if (f.d("Personal_Safety_Id") == null) {
                            f.q(new NotificationChannelGroup("Personal_Safety_Id", getString(R.string.personal_safety_channel_name)));
                        }
                        axbc.a(this, f, "crisis_alerts_3_1", R.string.crisis_alerts_notification_medium_importance_channel_name, true, null);
                        axbc.a(this, f, "crisis_alerts_2_1", R.string.crisis_alerts_notification_medium_importance_channel_name, false, Settings.System.DEFAULT_NOTIFICATION_URI);
                        axbc.a(this, f, "crisis_alerts_1_1", R.string.crisis_alerts_notification_high_importance_channel_name, true, Settings.System.DEFAULT_NOTIFICATION_URI);
                    }
                }
                if (axhhVar.c() && !axhhVar.d()) {
                    axdwVar.d.e(ewwi.RESTRICTION_COVERAGE);
                }
                if (axhhVar.a()) {
                    try {
                        final axeg axegVar = axdwVar.c;
                        axdv axdvVar = axegVar.f;
                        if (axdvVar == null) {
                            axegVar.h.e(ewwi.RESTRICTION_SYSTEM_ERROR);
                            return;
                        }
                        eaua eauaVar = axegVar.g;
                        Context context = axegVar.b;
                        axeo axeoVar = new axeo(context, new easm(1, eauaVar));
                        asot asotVar = axeg.a;
                        eauaVar.k(new eatq("USetSt", axeoVar));
                        eauaVar.k(new eatq("LocSetSt", new easo(new easm(2, eauaVar), context), Optional.of(new Consumer() { // from class: axea
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                axeg.this.a(((Integer) obj).intValue(), ewwi.RESTRICTION_LOCATION_OFF);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })));
                        eauaVar.k(new eatq("LocLstnrSt", axdvVar, Optional.of(new Consumer() { // from class: axeb
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                axeg.this.a(((Integer) obj).intValue(), ewwi.RESTRICTION_COVERAGE);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })));
                        eauaVar.k(new eato("ConObsSt", new eask(context, fnhq.a.a().v()), new easm(8, eauaVar), new eatn() { // from class: axec
                            @Override // defpackage.eatn
                            public final void a(Object obj, Object obj2) {
                                axeg.this.h.d(ewwj.WARNING_OFFLINE, !((Boolean) obj2).booleanValue());
                            }
                        }, new axdz()));
                        dzbh b = dzbh.b(context, asotVar);
                        SecureRandom secureRandom = new SecureRandom();
                        asnv asnvVar = axegVar.c;
                        eauaVar.k(new axfb(context, b, secureRandom, axdvVar, asnvVar));
                        axegVar.e.ifPresent(new Consumer() { // from class: axed
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                axbb axbbVar = (axbb) obj;
                                final axeg axegVar2 = axeg.this;
                                eaua eauaVar2 = axegVar2.g;
                                eauaVar2.k(new eato("NtfObsSt", axbbVar, new easm(7, eauaVar2), new eatn() { // from class: axdy
                                    @Override // defpackage.eatn
                                    public final void a(Object obj2, Object obj3) {
                                        boolean z = ((axba) obj3).a;
                                        axeg axegVar3 = axeg.this;
                                        axegVar3.h.d(ewwj.WARNING_NOTIFICATIONS_BLOCKED, z);
                                        axegVar3.j.i();
                                    }
                                }, new axdz()));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        axej axejVar = new axej(context, axegVar.d);
                        axegVar.i = axejVar;
                        eauf eaufVar = new eauf(context, 4, asnvVar, asotVar, axegVar.j, axdvVar, new axdz());
                        eauaVar.k(axejVar);
                        final axhe axheVar = axegVar.h;
                        Objects.requireNonNull(axheVar);
                        eauaVar.k(new eauh(Optional.of(new Runnable() { // from class: axee
                            @Override // java.lang.Runnable
                            public final void run() {
                                axhe.this.e(ewwi.RESTRICTION_NONE);
                            }
                        }), Optional.empty()));
                        eauaVar.e = eaufVar;
                        eauaVar.h();
                    } catch (axef | dzbj unused) {
                        axdwVar.d.e(ewwi.RESTRICTION_SYSTEM_ERROR);
                    }
                }
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
