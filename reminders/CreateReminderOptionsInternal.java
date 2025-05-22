package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.czmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CreateReminderOptionsInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czmv();
    public static final CreateReminderOptionsInternal a = new CreateReminderOptionsInternal(null, null, false);
    public final String b;
    public final String c;
    public final boolean d;

    public CreateReminderOptionsInternal(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a2);
    }
}
