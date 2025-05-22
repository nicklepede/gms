package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.auwq;
import defpackage.cyrg;
import defpackage.cyrh;
import defpackage.cyri;
import defpackage.cyro;
import defpackage.ekvl;
import defpackage.eqcy;
import defpackage.fugp;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PackageRemovedIntentOperation extends IntentOperation {
    private cyri a;
    private cyrh b;
    private final cyro c = cyro.a();

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new cyri(this);
        this.b = new cyrh(new auwq(this));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long j;
        cyro cyroVar;
        if (intent == null) {
            cyrg.b("Invalid package removed intent", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        ekvl.y(data);
        if (data.getSchemeSpecificPart().equals("com.android.vending")) {
            try {
                cyroVar = this.c;
                j = ((Long) ((eqcy) cyroVar.b()).u()).longValue();
            } catch (InterruptedException | ExecutionException unused) {
                j = -1;
            }
            try {
                cyroVar.c();
            } catch (InterruptedException | ExecutionException unused2) {
                cyrg.b("Failed to get notificationLastShownTimestampMs from ProtoDataStore", new Object[0]);
                if (j != -1) {
                }
                cyrg.a("No recent notifications shown - organic recovery", new Object[0]);
            }
            if (j != -1 || System.currentTimeMillis() - j > fugp.b()) {
                cyrg.a("No recent notifications shown - organic recovery", new Object[0]);
            } else if (this.b.a(fugp.e())) {
                cyrg.b("Bad version still installed", new Object[0]);
                this.a.b(4, 3);
            } else {
                cyrg.a("Successful recovery", new Object[0]);
                this.a.a(4);
            }
        }
    }
}
