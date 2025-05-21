package com.google.android.gms.fitness.sensors.activity;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import defpackage.asot;
import defpackage.bgae;
import defpackage.bggg;
import defpackage.bgmp;
import defpackage.bgms;
import defpackage.bhaf;
import defpackage.eitj;
import defpackage.eixf;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.fhrf;
import defpackage.fhrk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ActivityRecognitionIntentOperation extends IntentOperation {
    private static final asot a = bhaf.a();
    private bgms b;
    private bgae c;

    public ActivityRecognitionIntentOperation() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.fhxj a(defpackage.fhrf r10, java.util.List r11, long r12, int r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.sensors.activity.ActivityRecognitionIntentOperation.a(fhrf, java.util.List, long, int):fhxj");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = bgms.g(this);
        this.c = bggg.a(this).g();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fhrf fhrfVar;
        eitj eitjVar;
        ActivityRecognitionResult c;
        String action = intent.getAction();
        if (action != null) {
            fhrf[] values = fhrf.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                fhrfVar = values[i];
                if (action.equals(fhrfVar.c)) {
                    break;
                }
            }
        }
        fhrfVar = null;
        if (fhrfVar == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 4695)).B("Received an intent with no type: %s, ignoring", intent);
            return;
        }
        eitj<bgmp> b = this.b.b(fhrfVar);
        if (b.isEmpty()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4694)).B("Received intent %s with no listeners, ignoring", intent);
            this.b.f(fhrfVar);
            return;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_SENSOR_DATA_FOR_ACTIVITY")) {
            return;
        }
        this.c.f(2);
        List f = ActivityRecognitionResult.f(intent);
        if (f != null) {
            eitjVar = eitj.i(f);
        } else if (!ActivityRecognitionResult.g(intent) || (c = ActivityRecognitionResult.c(intent)) == null) {
            ((ejhf) ((ejhf) a.j()).ah(4685)).P("Received an intent %s %s with no result. Ignoring.", intent, intent.getExtras());
            eitjVar = ejcb.a;
        } else {
            eitjVar = eitj.l(c);
        }
        if (eitjVar.isEmpty()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4693)).x("No AR result.");
            return;
        }
        ArrayList arrayList = new ArrayList(eitjVar.size());
        int size = eitjVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) eitjVar.get(i2);
            if (activityRecognitionResult == null || activityRecognitionResult.b == 0) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4692)).B("Invalid AR result received: %s. Ignoring.", activityRecognitionResult);
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
                    ((ejhf) ((ejhf) a.i()).ah((char) 4691)).B("No detected activities: %s", activityRecognitionResult);
                } else {
                    int i3 = activityRecognitionResult.d;
                    fhrf fhrfVar2 = fhrf.DETAILED;
                    if (fhrfVar == fhrfVar2) {
                        arrayList.add(a(fhrfVar2, arrayList2, activityRecognitionResult.b, i3));
                    } else {
                        fhrf fhrfVar3 = fhrf.DEFAULT;
                        if (fhrfVar != fhrfVar3) {
                            ((ejhf) ((ejhf) a.i()).ah((char) 4689)).B("Unknown type: %s", fhrfVar);
                            return;
                        }
                        arrayList.add(a(fhrfVar3, eixf.d((arrayList2.size() <= 1 || ((DetectedActivity) arrayList2.get(0)).a() != 2) ? (DetectedActivity) arrayList2.get(0) : (DetectedActivity) arrayList2.get(1)), activityRecognitionResult.b, i3));
                    }
                }
            }
        }
        this.c.c(fhrk.g, arrayList.size());
        if (arrayList.isEmpty()) {
            return;
        }
        for (bgmp bgmpVar : b) {
            try {
                bgmpVar.c(eitj.i(arrayList));
            } catch (RemoteException e) {
                asot asotVar = a;
                ((ejhf) ((ejhf) ((ejhf) asotVar.j()).s(e)).ah((char) 4696)).x("Couldn't send event to listener. Assuming listener is dead.");
                this.b.e(bgmpVar);
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 4686)).x("Failed to deliver AR results to listener.");
            }
        }
    }

    public ActivityRecognitionIntentOperation(bgms bgmsVar, bgae bgaeVar) {
        this.b = bgmsVar;
        this.c = bgaeVar;
    }
}
