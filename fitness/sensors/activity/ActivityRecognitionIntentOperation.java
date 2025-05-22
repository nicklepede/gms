package com.google.android.gms.fitness.sensors.activity;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.ausn;
import defpackage.bieu;
import defpackage.bikw;
import defpackage.birf;
import defpackage.biri;
import defpackage.bjev;
import defpackage.elgo;
import defpackage.elkk;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.fkhc;
import defpackage.fkhh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ActivityRecognitionIntentOperation extends IntentOperation {
    private static final ausn a = bjev.a();
    private biri b;
    private bieu c;

    public ActivityRecognitionIntentOperation() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.fkng a(defpackage.fkhc r10, java.util.List r11, long r12, int r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation.a(fkhc, java.util.List, long, int):fkng");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = biri.g(this);
        this.c = bikw.a(this).g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fkhc fkhcVar;
        elgo elgoVar;
        ActivityRecognitionResult c;
        String action = intent.getAction();
        if (action != null) {
            fkhc[] values = fkhc.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                fkhcVar = values[i];
                if (action.equals(fkhcVar.c)) {
                    break;
                }
            }
        }
        fkhcVar = null;
        if (fkhcVar == null) {
            ((eluo) ((eluo) a.i()).ai((char) 4705)).B("Received an intent with no type: %s, ignoring", intent);
            return;
        }
        elgo<birf> b = this.b.b(fkhcVar);
        if (b.isEmpty()) {
            ((eluo) ((eluo) a.j()).ai((char) 4704)).B("Received intent %s with no listeners, ignoring", intent);
            this.b.f(fkhcVar);
            return;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY")) {
            return;
        }
        this.c.f(2);
        List f = ActivityRecognitionResult.f(intent);
        if (f != null) {
            elgoVar = elgo.i(f);
        } else if (!ActivityRecognitionResult.g(intent) || (c = ActivityRecognitionResult.c(intent)) == null) {
            ((eluo) ((eluo) a.j()).ai(4695)).P("Received an intent %s %s with no result. Ignoring.", intent, intent.getExtras());
            elgoVar = elpg.a;
        } else {
            elgoVar = elgo.l(c);
        }
        if (elgoVar.isEmpty()) {
            ((eluo) ((eluo) a.j()).ai((char) 4703)).x("No AR result.");
            return;
        }
        ArrayList arrayList = new ArrayList(elgoVar.size());
        int size = elgoVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) elgoVar.get(i2);
            if (activityRecognitionResult == null || activityRecognitionResult.b == 0) {
                ((eluo) ((eluo) a.j()).ai((char) 4702)).B("Invalid AR result received: %s. Ignoring.", activityRecognitionResult);
            } else {
                activityRecognitionResult.d();
                List<DetectedActivity> list = activityRecognitionResult.a;
                ArrayList arrayList2 = new ArrayList(list.size());
                for (DetectedActivity detectedActivity : list) {
                    if (detectedActivity.e > 0) {
                        arrayList2.add(detectedActivity);
                    }
                }
                if (arrayList2.isEmpty()) {
                    ((eluo) ((eluo) a.i()).ai((char) 4701)).B("No detected activities: %s", activityRecognitionResult);
                } else {
                    int i3 = activityRecognitionResult.d;
                    fkhc fkhcVar2 = fkhc.DETAILED;
                    if (fkhcVar == fkhcVar2) {
                        arrayList.add(a(fkhcVar2, arrayList2, activityRecognitionResult.b, i3));
                    } else {
                        fkhc fkhcVar3 = fkhc.DEFAULT;
                        if (fkhcVar != fkhcVar3) {
                            ((eluo) ((eluo) a.i()).ai((char) 4699)).B("Unknown type: %s", fkhcVar);
                            return;
                        }
                        arrayList.add(a(fkhcVar3, elkk.d((arrayList2.size() <= 1 || ((DetectedActivity) arrayList2.get(0)).a() != 2) ? (DetectedActivity) arrayList2.get(0) : (DetectedActivity) arrayList2.get(1)), activityRecognitionResult.b, i3));
                    }
                }
            }
        }
        this.c.c(fkhh.g, arrayList.size());
        if (arrayList.isEmpty()) {
            return;
        }
        for (birf birfVar : b) {
            try {
                birfVar.c(elgo.i(arrayList));
            } catch (RemoteException e) {
                ausn ausnVar = a;
                ((eluo) ((eluo) ((eluo) ausnVar.j()).s(e)).ai((char) 4706)).x("Couldn't send event to listener. Assuming listener is dead.");
                this.b.e(birfVar);
                ((eluo) ((eluo) ausnVar.j()).ai((char) 4696)).x("Failed to deliver AR results to listener.");
            }
        }
    }

    public ActivityRecognitionIntentOperation(biri biriVar, bieu bieuVar) {
        this.b = biriVar;
        this.c = bieuVar;
    }
}
