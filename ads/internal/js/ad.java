package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class ad implements com.google.android.gms.ads.internal.util.promise.a {
    final /* synthetic */ ab a;

    public ad(ab abVar) {
        this.a = abVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.a
    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aZ.g()).booleanValue()) {
            this.a.g(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.a.f();
        }
    }
}
