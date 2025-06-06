package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czog;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FeatureIdProtoEntity extends AbstractSafeParcelable implements FeatureIdProto {
    public static final Parcelable.Creator CREATOR = new czog();
    public final Long a;
    public final Long b;

    public FeatureIdProtoEntity(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public static int b(FeatureIdProto featureIdProto) {
        return Arrays.hashCode(new Object[]{featureIdProto.a(), featureIdProto.c()});
    }

    public static boolean d(FeatureIdProto featureIdProto, FeatureIdProto featureIdProto2) {
        return atyq.b(featureIdProto.a(), featureIdProto2.a()) && atyq.b(featureIdProto.c(), featureIdProto2.c());
    }

    @Override // com.google.android.gms.reminders.model.FeatureIdProto
    public final Long a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.FeatureIdProto
    public final Long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (FeatureIdProto) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czog.a(this, parcel);
    }

    public FeatureIdProtoEntity(FeatureIdProto featureIdProto) {
        this(featureIdProto.a(), featureIdProto.c());
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
