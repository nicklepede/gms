package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;
import defpackage.cxeb;
import defpackage.cxek;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FeatureIdProtoRef extends cxeb implements FeatureIdProto {
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

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return FeatureIdProtoEntity.d(this, (FeatureIdProto) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return FeatureIdProtoEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new FeatureIdProtoEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxek.a(new FeatureIdProtoEntity(this), parcel);
    }
}
