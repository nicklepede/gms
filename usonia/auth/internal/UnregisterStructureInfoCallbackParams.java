package com.google.android.gms.usonia.auth.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhug;
import defpackage.dhui;
import defpackage.dhuj;
import defpackage.dhul;
import defpackage.dhvl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class UnregisterStructureInfoCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhvl();
    public dhui a;
    public dhul b;

    public UnregisterStructureInfoCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterStructureInfoCallbackParams) {
            UnregisterStructureInfoCallbackParams unregisterStructureInfoCallbackParams = (UnregisterStructureInfoCallbackParams) obj;
            if (arwb.b(this.a, unregisterStructureInfoCallbackParams.a) && arwb.b(this.b, unregisterStructureInfoCallbackParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        dhul dhulVar = this.b;
        arxc.D(parcel, 2, dhulVar == null ? null : dhulVar.asBinder());
        arxc.c(parcel, a);
    }

    public UnregisterStructureInfoCallbackParams(IBinder iBinder, IBinder iBinder2) {
        dhui dhugVar;
        dhul dhulVar = null;
        if (iBinder == null) {
            dhugVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.auth.internal.IStructureInfoCallback");
            dhugVar = queryLocalInterface instanceof dhui ? (dhui) queryLocalInterface : new dhug(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.auth.internal.IUsoniaAuthStatusCallback");
            dhulVar = queryLocalInterface2 instanceof dhul ? (dhul) queryLocalInterface2 : new dhuj(iBinder2);
        }
        this.a = dhugVar;
        this.b = dhulVar;
    }
}
