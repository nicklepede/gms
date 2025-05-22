package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.auwq;
import defpackage.cyrg;
import defpackage.cyrh;
import defpackage.cyri;
import defpackage.cyrp;
import defpackage.ekvl;
import defpackage.fugp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NotificationClickedIntentOperation extends IntentOperation {
    private cyrh a;
    private cyri b;
    private cyrp c;

    private final void a(int i) {
        cyri cyriVar = this.b;
        if (cyriVar != null) {
            cyriVar.b(3, i);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        cyri cyriVar = new cyri(this);
        cyrh cyrhVar = new cyrh(new auwq(this));
        cyrp cyrpVar = new cyrp(this, cyriVar);
        this.a = cyrhVar;
        this.b = cyriVar;
        this.c = cyrpVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.phonesky.recovery.CLICK".equals(intent.getAction())) {
            return;
        }
        if (this.c == null || this.a == null) {
            cyrg.b("Invalid state", new Object[0]);
            a(3);
            return;
        }
        cyrg.a("Recovery notification clicked", new Object[0]);
        a(2);
        cyrp cyrpVar = this.c;
        ekvl.y(cyrpVar);
        cyrpVar.b();
        cyrh cyrhVar = this.a;
        ekvl.y(cyrhVar);
        if (cyrhVar.a(fugp.e())) {
            Intent intent2 = new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:com.android.vending"));
            intent2.setFlags(268468224);
            startActivity(intent2);
        }
    }
}
