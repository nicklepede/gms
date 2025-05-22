package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.chimera.IntentOperation;
import defpackage.cfcf;
import defpackage.cfco;
import defpackage.cfdm;
import defpackage.cfja;
import defpackage.cfjb;
import defpackage.cfjo;
import defpackage.fkxp;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class RingChimeraService extends cfdm {
    public RingChimeraService() {
        super(cfcf.a());
    }

    private final void i(boolean z) {
        String str;
        if (this.c) {
            str = "com.google.android.gms.findmydevice.spot.bleadvertising.RingStateChangedIntentOperation";
        } else {
            if (!this.b) {
                throw new AssertionError("Cannot determine request origin, no module to send ring state change intent to");
            }
            str = "com.google.android.gms.auth.proximity.phonehub.RingStateChangedIntentOperation";
        }
        Intent startIntent = IntentOperation.getStartIntent(this, str, "com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING_STATE_CHANGED");
        if (startIntent != null) {
            startService(startIntent.putExtra("com.google.android.gms.mdm.services.EXTRA_RING_STATE", z));
        }
    }

    @Override // defpackage.cfdm
    protected final cfja a() {
        return new cfja(this, this, this.i);
    }

    @Override // defpackage.cfdm
    protected final fkxp b(Intent intent) {
        if (intent.getBooleanExtra("includeConnectivityStatus", false)) {
            return cfjb.b(this);
        }
        return null;
    }

    @Override // defpackage.cfdm
    protected final void d() {
        this.b = true;
        i(true);
    }

    @Override // defpackage.cfdm
    protected final void e(Intent intent) {
        this.d = intent.getStringExtra("requestorNodeId");
        cfjo.b(this, this.d, "com.google.android.gms.mdm.RING_STARTED");
    }

    @Override // defpackage.cfdm
    protected final cfco h() {
        return new cfco();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r0 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r0.a = true;
        r0.interrupt();
        r1.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r0 = r1.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r1.b.setStreamVolume(4, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        defpackage.cfjj.e(r0, "Could not set stream volume", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003c, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.RingChimeraService.onDestroy():void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = thb.a;
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        new cfco().b();
        stopSelf();
        return true;
    }
}
