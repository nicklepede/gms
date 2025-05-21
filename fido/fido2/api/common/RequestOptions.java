package com.google.android.gms.fido.fido2.api.common;

import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.eiid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    public abstract ResultReceiver b();

    public abstract AuthenticationExtensions c();

    public abstract TokenBinding d();

    public abstract eiid e();

    public abstract Double f();

    public abstract Integer g();

    public abstract void h(ResultReceiver resultReceiver);

    public abstract byte[] i();

    public byte[] j() {
        throw null;
    }
}
