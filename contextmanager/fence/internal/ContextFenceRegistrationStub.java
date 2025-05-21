package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atpg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atpg();
    public final String a;
    public ContextFenceStub b;
    public final long c;

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub, long j) {
        this.a = str;
        this.b = contextFenceStub;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextFenceRegistrationStub)) {
            return false;
        }
        ContextFenceRegistrationStub contextFenceRegistrationStub = (ContextFenceRegistrationStub) obj;
        return TextUtils.equals(this.a, contextFenceRegistrationStub.a) && this.c == contextFenceRegistrationStub.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.q(parcel, 4, this.c);
        arxc.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextFenceRegistrationStub(String str, long j, ContextFenceStub contextFenceStub) {
        this(str, contextFenceStub, j);
        arwm.q(str);
        arwm.s(contextFenceStub);
    }
}
