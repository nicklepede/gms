package com.google.android.gms.update;

import android.content.Intent;
import android.os.RecoverySystem;
import defpackage.apzv;
import defpackage.auad;
import defpackage.auqx;
import defpackage.djuz;
import defpackage.ftqb;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WipeCacheSecretCodeIntentOperation extends apzv {
    private static final auad b = djuz.b("WipeCacheSecretCodeIntentOperation");

    public WipeCacheSecretCodeIntentOperation() {
        super("947322243");
    }

    @Override // defpackage.apzv
    public final void a(Intent intent) {
        if (!ftqb.a.lK().a()) {
            b.j("Cache wiping is not enabled.", new Object[0]);
            return;
        }
        auad auadVar = b;
        auadVar.j("wiping cache from SecretCodeIntentOperation", new Object[0]);
        try {
            if (auqx.t(this)) {
                RecoverySystem.rebootWipeCache(this);
            } else {
                auadVar.d("Can't reboot to wipe cache from non-primary user", new Object[0]);
            }
        } catch (IOException e) {
            b.n("failed to reboot to wipe cache:", e, new Object[0]);
        }
    }
}
