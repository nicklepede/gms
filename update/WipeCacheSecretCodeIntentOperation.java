package com.google.android.gms.update;

import android.content.Intent;
import android.os.RecoverySystem;
import defpackage.anyd;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.dhjt;
import defpackage.fqwi;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WipeCacheSecretCodeIntentOperation extends anyd {
    private static final arxo b = dhjt.b("WipeCacheSecretCodeIntentOperation");

    public WipeCacheSecretCodeIntentOperation() {
        super("947322243");
    }

    @Override // defpackage.anyd
    public final void a(Intent intent) {
        if (!fqwi.a.a().a()) {
            b.j("Cache wiping is not enabled.", new Object[0]);
            return;
        }
        arxo arxoVar = b;
        arxoVar.j("wiping cache from SecretCodeIntentOperation", new Object[0]);
        try {
            if (asnd.t(this)) {
                RecoverySystem.rebootWipeCache(this);
            } else {
                arxoVar.d("Can't reboot to wipe cache from non-primary user", new Object[0]);
            }
        } catch (IOException e) {
            b.n("failed to reboot to wipe cache:", e, new Object[0]);
        }
    }
}
