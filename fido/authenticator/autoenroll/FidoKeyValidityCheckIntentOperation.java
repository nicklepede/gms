package com.google.android.gms.fido.authenticator.autoenroll;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import defpackage.aumn;
import defpackage.bcuy;
import defpackage.bcva;
import defpackage.bddd;
import defpackage.bddm;
import defpackage.bdgb;
import defpackage.beow;
import defpackage.beox;
import defpackage.beoy;
import defpackage.bepb;
import defpackage.bepc;
import defpackage.bepq;
import defpackage.bzlv;
import defpackage.bzna;
import defpackage.fqqn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoKeyValidityCheckIntentOperation extends IntentOperation {
    private static final beow a = new beow("FidoKeyValidityCheckIntentOperation");
    private final Context b;
    private final beoy c;
    private final bepq d;
    private final bddd e;
    private final bdgb f;
    private final bddm g;
    private final bzlv h;
    private final bepc i;

    public FidoKeyValidityCheckIntentOperation() {
        this.b = this;
        this.c = beoy.a(beox.FIDO_KEY_VALIDITY_CHECK_V2);
        this.d = (bepq) bepq.b.b();
        this.e = new bddd(this);
        this.f = new bdgb();
        this.g = new bddm(this);
        this.h = bzna.a(AppContextProvider.a(), "fido", "com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheck", 0);
        this.i = bepb.a();
    }

    public static void a(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoKeyValidityCheckIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK_DELAY_COMPLETE"), 0, 134217728);
        aumn aumnVar = new aumn(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = fqqn.a.lK().a();
        aumnVar.d("FidoKeyValidityCheckIntentOperation", 2, elapsedRealtime + (a2 / 2) + ((long) (Math.random() * a2)), pendingIntent, str);
    }

    private final void b(Throwable th) {
        this.i.E(this.c, bcuy.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR, bcva.KEY_TYPE_KEYSTORE, 2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d5 A[Catch: bdqy -> 0x0219, bepp -> 0x021c, TryCatch #9 {bdqy -> 0x0219, bepp -> 0x021c, blocks: (B:23:0x0190, B:25:0x01a3, B:27:0x01b1, B:30:0x01c9, B:31:0x01cf, B:33:0x01d5, B:34:0x01e7, B:37:0x01ef, B:39:0x0208), top: B:22:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4 A[Catch: bepp -> 0x015a, TryCatch #8 {bepp -> 0x015a, blocks: (B:73:0x00c3, B:76:0x00da, B:77:0x00de, B:79:0x00e4, B:86:0x0134, B:88:0x0127, B:89:0x012e), top: B:72:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheckIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    FidoKeyValidityCheckIntentOperation(Context context, beoy beoyVar, bepq bepqVar, bddd bdddVar, bdgb bdgbVar, bddm bddmVar, bzlv bzlvVar, bepc bepcVar) {
        this.b = context;
        this.c = beoyVar;
        this.d = bepqVar;
        this.e = bdddVar;
        this.f = bdgbVar;
        this.g = bddmVar;
        this.h = bzlvVar;
        this.i = bepcVar;
    }
}
