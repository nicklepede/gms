package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avtj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avtj();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.q(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextFenceRegistrationStub(String str, long j, ContextFenceStub contextFenceStub) {
        this(str, contextFenceStub, j);
        atzb.q(str);
        atzb.s(contextFenceStub);
    }
}
