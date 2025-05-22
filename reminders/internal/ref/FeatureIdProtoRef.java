package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;
import defpackage.cznx;
import defpackage.czog;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FeatureIdProtoRef extends cznx implements FeatureIdProto {
    public FeatureIdProtoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean d(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "cell_id"), i, i2) && dataHolder.f(G(str, "fprint"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.FeatureIdProto
    public final Long a() {
        return o(p("cell_id"));
    }

    @Override // com.google.android.gms.reminders.model.FeatureIdProto
    public final Long c() {
        return o(p("fprint"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return FeatureIdProtoEntity.d(this, (FeatureIdProto) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return FeatureIdProtoEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new FeatureIdProtoEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czog.a(new FeatureIdProtoEntity(this), parcel);
    }
}
