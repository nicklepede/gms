package com.google.android.gms.auth.api.credentials.manager;

import android.content.Intent;
import defpackage.anyd;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.fkqe;
import defpackage.xwt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class OneTapDialogCooldownToggleSecretCodeIntentOperation extends anyd {
    private xwt b;

    public OneTapDialogCooldownToggleSecretCodeIntentOperation() {
        super("66382723");
    }

    @Override // defpackage.anyd
    public final void a(Intent intent) {
        if (fkqe.a.a().a()) {
            xwt xwtVar = this.b;
            synchronized (xwtVar.a) {
                bxdf bxdfVar = xwtVar.b;
                if (bxdg.h(bxdfVar, "cooldown_toggle_key")) {
                    bxdd c = bxdfVar.c();
                    c.j("cooldown_toggle_key");
                    bxdg.g(c);
                } else {
                    bxdd c2 = bxdfVar.c();
                    c2.e("cooldown_toggle_key", true);
                    bxdg.g(c2);
                }
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (this.b == null) {
            this.b = new xwt(getApplicationContext());
        }
    }

    OneTapDialogCooldownToggleSecretCodeIntentOperation(xwt xwtVar) {
        super("66382723");
        this.b = xwtVar;
    }
}
