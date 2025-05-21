package com.google.android.gms.personalsafety.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.asot;
import defpackage.aspo;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cvfw;
import defpackage.cvgb;
import defpackage.cvgn;
import defpackage.cvgy;
import defpackage.cvha;
import defpackage.cvhl;
import defpackage.cvhv;
import defpackage.cvhz;
import defpackage.cvpo;
import defpackage.cvpp;
import defpackage.cvtz;
import defpackage.cvuh;
import defpackage.eckb;
import defpackage.eiie;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.evxk;
import defpackage.evxp;
import defpackage.evxu;
import defpackage.evxw;
import j$.time.Duration;
import j$.util.Optional;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SndService extends Service {
    public long d;
    private long f;
    public final Object a = new Object();
    private final Executor e = new asmf(2, 9);
    public final cvfw b = new cvfw(AppContextProvider.a());
    public boolean c = false;
    private boolean g = false;

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, "com.google.android.gms.personalsafety.service.SndDetectionService"));
        return intent;
    }

    private final void b() {
        synchronized (this.a) {
            if (!this.g) {
                this.g = true;
                this.f = System.currentTimeMillis();
            }
        }
        ensj.t(eckb.b().c(), new cvuh(this), this.e);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== START SND Dump ====\n");
        aspo aspoVar = new aspo(printWriter, "  ");
        synchronized (this.a) {
            printWriter.append((CharSequence) ("\nInitialized: " + this.g + "\n"));
            printWriter.append((CharSequence) ("Initialized at: " + cvpp.b(this.f) + "\n"));
            printWriter.append((CharSequence) ("Snd active: " + this.c + "\n"));
            if (this.c) {
                printWriter.append((CharSequence) ("Snd started at: " + cvpp.b(this.d) + "\n"));
            }
            cvfw cvfwVar = this.b;
            printWriter.append((CharSequence) ("\nSensor Streaming: " + cvfwVar.g + "\n\n"));
            cvgb cvgbVar = cvfwVar.d;
            cvhz cvhzVar = cvgbVar.d;
            cvhzVar.h(cvhzVar.o);
            evxw evxwVar = cvhzVar.m;
            printWriter.append("\nMost recent screen session:\n");
            if ((evxwVar.b & 1) != 0) {
                printWriter.format("Start time: %s\n", cvpp.b(Duration.ofSeconds(evxwVar.c).toMillis()));
            }
            if ((evxwVar.b & 2) != 0) {
                printWriter.format("Duration (sec): %d\n", Integer.valueOf(evxwVar.d));
            }
            if ((evxwVar.b & 4) != 0) {
                printWriter.format("Largest peak: %f\n", Double.valueOf(evxwVar.e));
            }
            if ((evxwVar.b & 16) != 0) {
                printWriter.format("Count peaks: %d\n", Integer.valueOf(evxwVar.h));
            }
            ArrayDeque arrayDeque = cvhzVar.a;
            printWriter.format("\nAccel sample buffer size: %d\n", Integer.valueOf(arrayDeque.size()));
            printWriter.append("\nAccel samples:\n");
            Iterator descendingIterator = arrayDeque.descendingIterator();
            for (int i = 0; descendingIterator.hasNext() && i < 30; i++) {
                printWriter.format("%s\n", descendingIterator.next());
            }
            printWriter.append("\nDebug events:\n");
            Iterator it = cvhzVar.c.iterator();
            while (it.hasNext()) {
                evxp evxpVar = ((evxu) it.next()).e;
                if (evxpVar == null) {
                    evxpVar = evxp.a;
                }
                printWriter.append((CharSequence) (cvpp.b(evxpVar.c) + "; Spike:" + evxpVar.g + "; BatchSize:" + evxpVar.f + "\n"));
            }
            printWriter.append("\n");
            printWriter.append("\nPeaks:\n");
            Iterator it2 = cvgbVar.e.iterator();
            while (it2.hasNext()) {
                eiie eiieVar = (eiie) it2.next();
                String valueOf = String.valueOf(eiieVar.b);
                Object obj = eiieVar.a;
                printWriter.append((CharSequence) (valueOf + " at " + String.valueOf(obj) + " " + cvpp.b(cvgbVar.l + ((Long) obj).longValue()) + " - " + ((String) cvgbVar.f.get(obj)) + "\n"));
            }
            printWriter.append("\n== Snd status ==\n");
            Iterator it3 = cvgbVar.p.iterator();
            while (it3.hasNext()) {
                cvhv cvhvVar = (cvhv) it3.next();
                cvha cvhaVar = cvhvVar.a;
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                cvhl cvhlVar = cvhaVar.g;
                float f = cvhlVar.a;
                cvhl cvhlVar2 = cvhaVar.f;
                float f2 = f - cvhlVar2.a;
                String str = cvhlVar2.toString() + cvhlVar.toString() + f2;
                printWriter.append((CharSequence) ("status=" + cvhvVar.b.ordinal() + "; time=" + cvpp.b(currentTimeMillis + cvhaVar.a) + "; model=" + cvhaVar.b + "; conf=" + cvhaVar.c + "; peak=" + cvhaVar.d + "; disconnecting=" + ((evxk) cvhvVar.c.b).g + "; connected=" + String.valueOf(cvhvVar.c()) + "; network=" + (cvhvVar.d() - 1) + "; info=" + str + "\n"));
            }
            printWriter.append("== End Snd status ==\n");
            ArrayDeque arrayDeque2 = cvgbVar.v;
            if (!arrayDeque2.isEmpty()) {
                printWriter.append("\n== Begin stl ==\n");
                Iterator it4 = arrayDeque2.iterator();
                while (it4.hasNext()) {
                    printWriter.append((CharSequence) String.valueOf((String) it4.next()).concat("\n"));
                }
                printWriter.append("== End stl ==\n");
            }
            ArrayDeque arrayDeque3 = cvgbVar.w;
            if (!arrayDeque3.isEmpty()) {
                printWriter.append("\n== Begin esc ==\n");
                Iterator it5 = arrayDeque3.iterator();
                while (it5.hasNext()) {
                    printWriter.append((CharSequence) String.valueOf((String) it5.next()).concat("\n"));
                }
                printWriter.append("== End esc ==\n");
            }
            if (cvgbVar.q != null) {
                printWriter.append("\nLast config:\n");
                printWriter.append((CharSequence) ("batchDuration=" + String.valueOf(cvgbVar.q.a) + "\n"));
                printWriter.append((CharSequence) ("numBatches=" + cvgbVar.q.b + "\n"));
                printWriter.append((CharSequence) ("pt=" + cvgbVar.q.c + "\n"));
            }
            printWriter.append("\n== Activity Logs ==\n");
            for (Map.Entry entry : cvgbVar.k.entrySet()) {
                DetectedActivity d = ((ActivityRecognitionResult) entry.getValue()).d();
                printWriter.append((CharSequence) ("At " + cvpp.b(((Long) entry.getKey()).longValue()) + " " + String.valueOf(d) + "\n"));
            }
            printWriter.append("==End Activity Logs ==\n");
        }
        printWriter.append("\n== Flags ==\n");
        aspoVar.b();
        cvtz.b(aspoVar);
        aspoVar.a();
        printWriter.append("\n== Backup dump of PSA flags ==\n");
        aspoVar.b();
        cvtz.a(aspoVar);
        aspoVar.a();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        char c;
        if (intent == null) {
            asot asotVar = cvpo.a;
            b();
        } else {
            String action = intent.getAction();
            if (action == null) {
                ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8709)).x("Unexpected null action");
            } else {
                switch (action.hashCode()) {
                    case -2046552780:
                        if (action.equals("com.google.android.gms.personalsafety.ACTION_SETTING_CHANGE")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1984146813:
                        if (action.equals("com.google.android.gms.personalsafety.ACTION_SIMULATE_SND")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 609204587:
                        if (action.equals("com.google.android.gms.personalsafety.ACTION_AAPM_STATE_CHANGE")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767285733:
                        if (action.equals("com.google.android.gms.personalsafety.ACTION_INIT")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0 || c == 1) {
                    AppContextProvider.a();
                    eijr eijrVar = bqqe.a;
                    bqqa.a(aseu.PERSONALSAFETY_THEFT_SND_TOGGLE);
                } else if (c != 2) {
                    if (c != 3) {
                        ((ejhf) ((ejhf) cvpo.a.j()).ah((char) 8708)).B("Unexpected action %s", action);
                    } else {
                        synchronized (this.a) {
                            cvgn cvgnVar = this.b.d.y;
                            cvgy a = cvha.a();
                            a.c(SystemClock.elapsedRealtime());
                            cvgnVar.a(new cvhv(a.a(), false, Optional.empty()));
                        }
                    }
                }
                b();
            }
        }
        return 1;
    }
}
