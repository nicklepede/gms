package com.google.android.gms.fido.fido2.api.common;

import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ekvi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class RequestOptions extends AbstractSafeParcelable {
    public abstract ResultReceiver b();

    public abstract AuthenticationExtensions c();

    public abstract TokenBinding d();

    public abstract ekvi e();

    public abstract Double f();

    public abstract Integer g();

    public abstract void h(ResultReceiver resultReceiver);

    public abstract byte[] i();

    public byte[] j() {
        throw null;
    }
}
