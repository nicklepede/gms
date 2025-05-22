package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.djgl;
import defpackage.djha;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcWriteLocalSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djha();
    public final SettingChange[] a;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SettingChange extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new djgl();
        public final int a;
        public final boolean b;

        public SettingChange(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.e(parcel, 3, this.b);
            atzr.c(parcel, a);
        }
    }

    public UdcWriteLocalSettingsRequest(SettingChange[] settingChangeArr) {
        this.a = settingChangeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 2, this.a, i);
        atzr.c(parcel, a);
    }
}
