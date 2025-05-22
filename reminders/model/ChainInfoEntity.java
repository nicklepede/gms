package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.czoa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ChainInfoEntity extends AbstractSafeParcelable implements ChainInfo {
    public static final Parcelable.Creator CREATOR = new czoa();
    public final String a;
    public final FeatureIdProtoEntity b;

    public ChainInfoEntity(String str, FeatureIdProtoEntity featureIdProtoEntity) {
        this.a = str;
        this.b = featureIdProtoEntity;
    }

    public static int b(ChainInfo chainInfo) {
        return Arrays.hashCode(new Object[]{chainInfo.c(), chainInfo.a()});
    }

    public static boolean d(ChainInfo chainInfo, ChainInfo chainInfo2) {
        return atyq.b(chainInfo.c(), chainInfo2.c()) && atyq.b(chainInfo.a(), chainInfo2.a());
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final FeatureIdProto a() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (ChainInfo) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czoa.a(this, parcel, i);
    }

    public ChainInfoEntity(ChainInfo chainInfo) {
        String c = chainInfo.c();
        FeatureIdProto a = chainInfo.a();
        this.a = c;
        this.b = a == null ? null : new FeatureIdProtoEntity(a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
