package com.google.android.gms.motionsicknessassist.operation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.motionsicknessassist.service.MotionSicknessAssistChimeraService;
import defpackage.asot;
import defpackage.bzgy;
import defpackage.bzhd;
import defpackage.cetp;
import defpackage.cetu;
import defpackage.ceub;
import defpackage.cevj;
import defpackage.eiig;
import defpackage.eiuu;
import defpackage.eivv;
import defpackage.ejdg;
import defpackage.ejfg;
import defpackage.ejhf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ActivityRecognitionIntentOperation extends IntentOperation {
    public static final asot a = cetu.a("AR");
    public static bzgy b;
    static final eiuu c;
    public static final ActivityTransitionRequest d;
    private static final eiuu e;
    private static final List f;

    static {
        ejdg ejdgVar = new ejdg(Pair.create(16, 0));
        e = ejdgVar;
        c = eiuu.L(Pair.create(16, 1), Pair.create(7, 0), Pair.create(8, 0));
        f = new ArrayList();
        ejfg listIterator = ejdgVar.listIterator();
        while (listIterator.hasNext()) {
            Pair pair = (Pair) listIterator.next();
            bzhd bzhdVar = new bzhd();
            bzhdVar.a = ((Integer) pair.first).intValue();
            bzhdVar.b(((Integer) pair.second).intValue());
            f.add(bzhdVar.a());
        }
        ejfg listIterator2 = c.listIterator();
        while (listIterator2.hasNext()) {
            Pair pair2 = (Pair) listIterator2.next();
            bzhd bzhdVar2 = new bzhd();
            bzhdVar2.a = ((Integer) pair2.first).intValue();
            bzhdVar2.b(((Integer) pair2.second).intValue());
            f.add(bzhdVar2.a());
        }
        d = new ActivityTransitionRequest(f);
    }

    public static PendingIntent a(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, ActivityRecognitionIntentOperation.class, "com.google.android.gms.motionsicknessassist.ACTION_ACTIVITY_RECOGNITION_DETECTED");
        eiig.x(startIntent);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, ActivityRecognitionIntentOperation.class, startIntent, 0, 134217728);
        eiig.x(pendingIntent);
        return pendingIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ActivityTransitionResult a2;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 6441)).B("onHandleIntent action: %s", action);
        if (!action.equals("com.google.android.gms.motionsicknessassist.ACTION_ACTIVITY_RECOGNITION_DETECTED") || (a2 = ActivityTransitionResult.a(intent)) == null) {
            return;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) eivv.p(a2.a);
        Context applicationContext = getApplicationContext();
        if (activityTransitionEvent != null) {
            cevj cevjVar = new cevj(applicationContext);
            int i = activityTransitionEvent.b;
            int i2 = activityTransitionEvent.a;
            ((ejhf) ((ejhf) asotVar.h()).ah(6433)).P("Handling activity transition Event: [%s] [%s]", DetectedActivity.b(i2), i == 0 ? "ENTERING" : "EXITING");
            Pair create = Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
            if (e.contains(create)) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 6436)).x("In vehicle transition detected.");
                MotionSicknessAssistChimeraService.c(applicationContext, ceub.AUTOMATIC_CAR_DETECTION);
                cetp.a(cevjVar.l(true));
            } else {
                if (!c.contains(create)) {
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 6434)).x("Unhandled activity transition. Skipping");
                    return;
                }
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 6435)).x("Exiting vehicle transition detected.");
                MotionSicknessAssistChimeraService.d(applicationContext, ceub.AUTOMATIC_CAR_DETECTION);
                cetp.a(cevjVar.l(false));
            }
        }
    }
}
