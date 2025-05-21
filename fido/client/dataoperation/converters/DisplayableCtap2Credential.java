package com.google.android.gms.fido.client.dataoperation.converters;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.eiid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DisplayableCtap2Credential extends PublicKeyCredential {
    public final eiid a;

    public DisplayableCtap2Credential(PublicKeyCredential publicKeyCredential, eiid eiidVar) {
        super(publicKeyCredential.b, publicKeyCredential.c, publicKeyCredential.d, publicKeyCredential.e, publicKeyCredential.f, publicKeyCredential.g, publicKeyCredential.h, publicKeyCredential.i);
        this.a = eiidVar;
    }
}
