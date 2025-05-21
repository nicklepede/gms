package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cman;
import defpackage.eikf;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ShareTargetAction extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cman();
    public final String a;
    public final Icon b;
    public final PendingIntent c;
    public final String d;
    public final boolean e;

    public ShareTargetAction(String str, Icon icon, PendingIntent pendingIntent, String str2, boolean z) {
        this.a = str;
        this.b = icon;
        this.c = pendingIntent;
        this.d = str2;
        this.e = z;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ShareTargetAction clone() {
        try {
            return (ShareTargetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new eikf(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ShareTargetAction) {
            ShareTargetAction shareTargetAction = (ShareTargetAction) obj;
            if (arwb.b(this.a, shareTargetAction.a) && arwb.b(this.b, shareTargetAction.b) && arwb.b(this.c, shareTargetAction.c) && arwb.b(this.d, shareTargetAction.d) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(shareTargetAction.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "ShareTargetAction<title: %s, pendingIntent: %s, actionName: %s, isDefault: %s>", this.a, this.c, this.d, Boolean.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
