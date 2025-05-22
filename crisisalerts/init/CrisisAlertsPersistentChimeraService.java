package com.google.android.gms.crisisalerts.init;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import com.google.android.gms.R;
import defpackage.aued;
import defpackage.aura;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.auub;
import defpackage.azfc;
import defpackage.azgw;
import defpackage.azhg;
import defpackage.azhv;
import defpackage.azhw;
import defpackage.azhz;
import defpackage.azif;
import defpackage.azig;
import defpackage.azij;
import defpackage.azio;
import defpackage.azjb;
import defpackage.azle;
import defpackage.azlh;
import defpackage.ebnv;
import defpackage.edex;
import defpackage.edez;
import defpackage.edfb;
import defpackage.edga;
import defpackage.edgb;
import defpackage.edgd;
import defpackage.edgn;
import defpackage.edgs;
import defpackage.edgu;
import defpackage.ezkr;
import defpackage.fpzr;
import defpackage.fxqo;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsPersistentChimeraService extends azgw {
    public static final ausn a = azhg.a("PS");
    public azhw b;

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        azig azigVar;
        printWriter.println("##CRiAl Start");
        azhw azhwVar = this.b;
        Object obj = azhwVar.b;
        if (obj == null) {
            obj = "n/a";
        }
        printWriter.println(obj);
        if (fpzr.f() && (azigVar = azhwVar.c) != null) {
            edgn edgnVar = azigVar.g;
            if (edgnVar != null) {
                edgnVar.b(printWriter);
            }
            azigVar.k.a(printWriter);
        }
        printWriter.println("##CRiAl End");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // defpackage.azgw, com.google.android.chimera.Service
    public final void onCreate() {
        aued f;
        super.onCreate();
        azhw azhwVar = this.b;
        if (azhwVar.a.compareAndSet(false, true)) {
            azlh azlhVar = azhwVar.b;
            if (azlhVar.b()) {
                int i = true != azlhVar.c() ? 2 : 1;
                aura.M("com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingInjectorService", i);
                aura.M("com.google.android.gms.crisisalerts.settings.CrisisAlertsSettingsActivity", i);
                aura.M("com.google.android.gms.crisisalerts.GcmReceiverService", true != azlhVar.a() ? 2 : 1);
                if (azlhVar.d()) {
                    int i2 = azfc.a;
                    if (auub.c() && auub.c() && (f = aued.f(this)) != null) {
                        if (f.d("Personal_Safety_Id") == null) {
                            f.q(new NotificationChannelGroup("Personal_Safety_Id", getString(R.string.personal_safety_channel_name)));
                        }
                        azfc.a(this, f, "crisis_alerts_3_1", R.string.crisis_alerts_notification_medium_importance_channel_name, true, null);
                        azfc.a(this, f, "crisis_alerts_2_1", R.string.crisis_alerts_notification_medium_importance_channel_name, false, Settings.System.DEFAULT_NOTIFICATION_URI);
                        azfc.a(this, f, "crisis_alerts_1_1", R.string.crisis_alerts_notification_high_importance_channel_name, true, Settings.System.DEFAULT_NOTIFICATION_URI);
                    }
                }
                if (azlhVar.c() && !azlhVar.d()) {
                    azhwVar.d.e(ezkr.RESTRICTION_COVERAGE);
                }
                if (azlhVar.a()) {
                    try {
                        final azig azigVar = azhwVar.c;
                        azhv azhvVar = azigVar.f;
                        if (azhvVar == null) {
                            azigVar.h.e(ezkr.RESTRICTION_SYSTEM_ERROR);
                            return;
                        }
                        edgn edgnVar = azigVar.g;
                        Context context = azigVar.b;
                        azio azioVar = new azio(context, new edez(1, edgnVar));
                        ausn ausnVar = azig.a;
                        edgnVar.k(new edgd("USetSt", azioVar));
                        edgnVar.k(new edgd("LocSetSt", new edfb(new edez(2, edgnVar), context), Optional.of(new Consumer() { // from class: azia
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                azig.this.a(((Integer) obj).intValue(), ezkr.RESTRICTION_LOCATION_OFF);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })));
                        edgnVar.k(new edgd("LocLstnrSt", azhvVar, Optional.of(new Consumer() { // from class: azib
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                azig.this.a(((Integer) obj).intValue(), ezkr.RESTRICTION_COVERAGE);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        })));
                        edgnVar.k(new edgb("ConObsSt", new edex(context, fpzr.a.lK().v()), new edez(8, edgnVar), new edga() { // from class: azic
                            @Override // defpackage.edga
                            public final void a(Object obj, Object obj2) {
                                azig.this.h.d(ezks.WARNING_OFFLINE, !((Boolean) obj2).booleanValue());
                            }
                        }, new azhz()));
                        fxqo fxqoVar = azigVar.i;
                        SecureRandom secureRandom = new SecureRandom();
                        aurp aurpVar = azigVar.c;
                        edgnVar.k(new azjb(context, fxqoVar, secureRandom, azhvVar, aurpVar));
                        azigVar.e.ifPresent(new Consumer() { // from class: azid
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                azfb azfbVar = (azfb) obj;
                                final azig azigVar2 = azig.this;
                                edgn edgnVar2 = azigVar2.g;
                                edgnVar2.k(new edgb("NtfObsSt", azfbVar, new edez(7, edgnVar2), new edga() { // from class: azhy
                                    @Override // defpackage.edga
                                    public final void a(Object obj2, Object obj3) {
                                        boolean z = ((azfa) obj3).a;
                                        azig azigVar3 = azig.this;
                                        azigVar3.h.d(ezks.WARNING_NOTIFICATIONS_BLOCKED, z);
                                        azigVar3.k.i();
                                    }
                                }, new azhz()));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        azij azijVar = new azij(context, azigVar.d);
                        azigVar.j = azijVar;
                        edgs edgsVar = new edgs(context, 4, aurpVar, ausnVar, azigVar.k, azhvVar, new azhz());
                        edgnVar.k(azijVar);
                        final azle azleVar = azigVar.h;
                        Objects.requireNonNull(azleVar);
                        edgnVar.k(new edgu(Optional.of(new Runnable() { // from class: azie
                            @Override // java.lang.Runnable
                            public final void run() {
                                azle.this.e(ezkr.RESTRICTION_NONE);
                            }
                        }), Optional.empty()));
                        edgnVar.e = edgsVar;
                        edgnVar.h();
                    } catch (azif | ebnv unused) {
                        azhwVar.d.e(ezkr.RESTRICTION_SYSTEM_ERROR);
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
