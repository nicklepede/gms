package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.assw;
import defpackage.cwhj;
import defpackage.cwhk;
import defpackage.cwhl;
import defpackage.cwhr;
import defpackage.eiig;
import defpackage.enpf;
import defpackage.frmq;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PackageRemovedIntentOperation extends IntentOperation {
    private cwhl a;
    private cwhk b;
    private final cwhr c = cwhr.a();

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new cwhl(this);
        this.b = new cwhk(new assw(this));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long j;
        cwhr cwhrVar;
        if (intent == null) {
            cwhj.b("Invalid package removed intent", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        eiig.x(data);
        if (data.getSchemeSpecificPart().equals("com.android.vending")) {
            try {
                cwhrVar = this.c;
                j = ((Long) ((enpf) cwhrVar.b()).u()).longValue();
            } catch (InterruptedException | ExecutionException unused) {
                j = -1;
            }
            try {
                cwhrVar.c();
            } catch (InterruptedException | ExecutionException unused2) {
                cwhj.b("Failed to get notificationLastShownTimestampMs from ProtoDataStore", new Object[0]);
                if (j != -1) {
                }
                cwhj.a("No recent notifications shown - organic recovery", new Object[0]);
            }
            if (j != -1 || System.currentTimeMillis() - j > frmq.b()) {
                cwhj.a("No recent notifications shown - organic recovery", new Object[0]);
            } else if (this.b.a(frmq.e())) {
                cwhj.b("Bad version still installed", new Object[0]);
                this.a.b(4, 3);
            } else {
                cwhj.a("Successful recovery", new Object[0]);
                this.a.a(4);
            }
        }
    }
}
