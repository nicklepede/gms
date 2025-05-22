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
import defpackage.auio;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auti;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cxpf;
import defpackage.cxpk;
import defpackage.cxpw;
import defpackage.cxqh;
import defpackage.cxqj;
import defpackage.cxqw;
import defpackage.cxrh;
import defpackage.cxrl;
import defpackage.cxze;
import defpackage.cxzf;
import defpackage.cydw;
import defpackage.cyee;
import defpackage.eewt;
import defpackage.ekvj;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eyng;
import defpackage.eynl;
import defpackage.eynq;
import defpackage.eyns;
import j$.time.Duration;
import j$.util.Optional;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SndService extends Service {
    public long d;
    private long f;
    public final Object a = new Object();
    private final Executor e = new aupz(2, 9);
    public final cxpf b = new cxpf(AppContextProvider.a());
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
        eqgc.t(eewt.b().c(), new cyee(this), this.e);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== START SND Dump ====\n");
        auti autiVar = new auti(printWriter, "  ");
        synchronized (this.a) {
            printWriter.append((CharSequence) ("\nInitialized: " + this.g + "\n"));
            printWriter.append((CharSequence) ("Initialized at: " + cxzf.b(this.f) + "\n"));
            printWriter.append((CharSequence) ("Snd active: " + this.c + "\n"));
            if (this.c) {
                printWriter.append((CharSequence) ("Snd started at: " + cxzf.b(this.d) + "\n"));
            }
            cxpf cxpfVar = this.b;
            printWriter.append((CharSequence) ("\nSensor Streaming: " + cxpfVar.g + "\n\n"));
            cxpk cxpkVar = cxpfVar.d;
            cxrl cxrlVar = cxpkVar.d;
            cxrlVar.h(cxrlVar.o);
            eyns eynsVar = cxrlVar.m;
            printWriter.append("\nMost recent screen session:\n");
            if ((eynsVar.b & 1) != 0) {
                printWriter.format("Start time: %s\n", cxzf.b(Duration.ofSeconds(eynsVar.c).toMillis()));
            }
            if ((eynsVar.b & 2) != 0) {
                printWriter.format("Duration (sec): %d\n", Integer.valueOf(eynsVar.d));
            }
            if ((eynsVar.b & 4) != 0) {
                printWriter.format("Largest peak: %f\n", Double.valueOf(eynsVar.e));
            }
            if ((eynsVar.b & 16) != 0) {
                printWriter.format("Count peaks: %d\n", Integer.valueOf(eynsVar.h));
            }
            ArrayDeque arrayDeque = cxrlVar.a;
            printWriter.format("\nAccel sample buffer size: %d\n", Integer.valueOf(arrayDeque.size()));
            printWriter.append("\nAccel samples:\n");
            Iterator descendingIterator = arrayDeque.descendingIterator();
            for (int i = 0; descendingIterator.hasNext() && i < 30; i++) {
                printWriter.format("%s\n", descendingIterator.next());
            }
            printWriter.append("\nDebug events:\n");
            Iterator it = cxrlVar.c.iterator();
            while (it.hasNext()) {
                eynl eynlVar = ((eynq) it.next()).e;
                if (eynlVar == null) {
                    eynlVar = eynl.a;
                }
                printWriter.append((CharSequence) (cxzf.b(eynlVar.c) + "; Spike:" + eynlVar.g + "; BatchSize:" + eynlVar.f + "\n"));
            }
            printWriter.append("\n");
            printWriter.append("\nPeaks:\n");
            Iterator it2 = cxpkVar.e.iterator();
            while (it2.hasNext()) {
                ekvj ekvjVar = (ekvj) it2.next();
                String valueOf = String.valueOf(ekvjVar.b);
                Object obj = ekvjVar.a;
                printWriter.append((CharSequence) (valueOf + " at " + String.valueOf(obj) + " " + cxzf.b(cxpkVar.l + ((Long) obj).longValue()) + " - " + ((String) cxpkVar.f.get(obj)) + "\n"));
            }
            printWriter.append("\n== Snd status ==\n");
            Iterator it3 = cxpkVar.p.iterator();
            while (it3.hasNext()) {
                cxrh cxrhVar = (cxrh) it3.next();
                cxqj cxqjVar = cxrhVar.a;
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                cxqw cxqwVar = cxqjVar.g;
                float f = cxqwVar.a;
                cxqw cxqwVar2 = cxqjVar.f;
                float f2 = f - cxqwVar2.a;
                String str = cxqwVar2.toString() + cxqwVar.toString() + f2;
                printWriter.append((CharSequence) ("status=" + cxrhVar.b.ordinal() + "; time=" + cxzf.b(currentTimeMillis + cxqjVar.a) + "; model=" + cxqjVar.b + "; conf=" + cxqjVar.c + "; peak=" + cxqjVar.d + "; disconnecting=" + ((eyng) cxrhVar.c.b).g + "; connected=" + String.valueOf(cxrhVar.c()) + "; network=" + (cxrhVar.d() - 1) + "; info=" + str + "\n"));
            }
            printWriter.append("== End Snd status ==\n");
            ArrayDeque arrayDeque2 = cxpkVar.v;
            if (!arrayDeque2.isEmpty()) {
                printWriter.append("\n== Begin stl ==\n");
                Iterator it4 = arrayDeque2.iterator();
                while (it4.hasNext()) {
                    printWriter.append((CharSequence) String.valueOf((String) it4.next()).concat("\n"));
                }
                printWriter.append("== End stl ==\n");
            }
            ArrayDeque arrayDeque3 = cxpkVar.w;
            if (!arrayDeque3.isEmpty()) {
                printWriter.append("\n== Begin esc ==\n");
                Iterator it5 = arrayDeque3.iterator();
                while (it5.hasNext()) {
                    printWriter.append((CharSequence) String.valueOf((String) it5.next()).concat("\n"));
                }
                printWriter.append("== End esc ==\n");
            }
            if (cxpkVar.q != null) {
                printWriter.append("\nLast config:\n");
                printWriter.append((CharSequence) ("batchDuration=" + String.valueOf(cxpkVar.q.a) + "\n"));
                printWriter.append((CharSequence) ("numBatches=" + cxpkVar.q.b + "\n"));
                printWriter.append((CharSequence) ("pt=" + cxpkVar.q.c + "\n"));
            }
            printWriter.append("\n== Activity Logs ==\n");
            for (Map.Entry entry : cxpkVar.k.entrySet()) {
                DetectedActivity d = ((ActivityRecognitionResult) entry.getValue()).d();
                printWriter.append((CharSequence) ("At " + cxzf.b(((Long) entry.getKey()).longValue()) + " " + String.valueOf(d) + "\n"));
            }
            printWriter.append("==End Activity Logs ==\n");
        }
        printWriter.append("\n== Flags ==\n");
        autiVar.b();
        cydw.b(autiVar);
        autiVar.a();
        printWriter.append("\n== Backup dump of PSA flags ==\n");
        autiVar.b();
        cydw.a(autiVar);
        autiVar.a();
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
            ausn ausnVar = cxze.a;
            b();
        } else {
            String action = intent.getAction();
            if (action == null) {
                ((eluo) ((eluo) cxze.a.j()).ai((char) 8707)).x("Unexpected null action");
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
                    ekww ekwwVar = bsxv.a;
                    bsxr.a(auio.PERSONALSAFETY_THEFT_SND_TOGGLE);
                } else if (c != 2) {
                    if (c != 3) {
                        ((eluo) ((eluo) cxze.a.j()).ai((char) 8706)).B("Unexpected action %s", action);
                    } else {
                        synchronized (this.a) {
                            cxpw cxpwVar = this.b.d.y;
                            cxqh a = cxqj.a();
                            a.c(SystemClock.elapsedRealtime());
                            cxpwVar.a(new cxrh(a.a(), false, Optional.empty()));
                        }
                    }
                }
                b();
            }
        }
        return 1;
    }
}
