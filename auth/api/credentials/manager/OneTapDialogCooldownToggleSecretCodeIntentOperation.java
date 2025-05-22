package com.google.android.gms.auth.api.credentials.manager;

import android.content.Intent;
import defpackage.apzv;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.fnhd;
import defpackage.zuq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class OneTapDialogCooldownToggleSecretCodeIntentOperation extends apzv {
    private zuq b;

    public OneTapDialogCooldownToggleSecretCodeIntentOperation() {
        super("66382723");
    }

    @Override // defpackage.apzv
    public final void a(Intent intent) {
        if (fnhd.a.lK().a()) {
            zuq zuqVar = this.b;
            synchronized (zuqVar.a) {
                bzlv bzlvVar = zuqVar.b;
                if (bzlw.h(bzlvVar, "cooldown_toggle_key")) {
                    bzlt c = bzlvVar.c();
                    c.j("cooldown_toggle_key");
                    bzlw.g(c);
                } else {
                    bzlt c2 = bzlvVar.c();
                    c2.e("cooldown_toggle_key", true);
                    bzlw.g(c2);
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (this.b == null) {
            this.b = new zuq(getApplicationContext());
        }
    }

    OneTapDialogCooldownToggleSecretCodeIntentOperation(zuq zuqVar) {
        super("66382723");
        this.b = zuqVar;
    }
}
