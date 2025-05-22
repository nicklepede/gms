package com.google.android.gms.auth.authzen.cryptauth;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.auth.authzen.GcmReceiverChimeraService;
import defpackage.auad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DialerSecretCodeChimeraReceiver extends BroadcastReceiver {
    public static final auad b = new auad("CryptauthDialerCodeReceiver");

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b.h("Secret code activated, intent=%s", intent);
        GcmReceiverChimeraService.b(context, new Intent("com.google.android.gms.auth.authzen.REGISTER_NOW"));
        Toast.makeText(context, "Forcing CryptAuth enrollment", 0).show();
    }
}
