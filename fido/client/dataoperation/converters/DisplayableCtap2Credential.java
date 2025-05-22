package com.google.android.gms.fido.client.dataoperation.converters;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.ekvi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DisplayableCtap2Credential extends PublicKeyCredential {
    public final ekvi a;

    public DisplayableCtap2Credential(PublicKeyCredential publicKeyCredential, ekvi ekviVar) {
        super(publicKeyCredential.b, publicKeyCredential.c, publicKeyCredential.d, publicKeyCredential.e, publicKeyCredential.f, publicKeyCredential.g, publicKeyCredential.h, publicKeyCredential.i);
        this.a = ekviVar;
    }
}
