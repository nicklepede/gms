package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.asxd;
import defpackage.atlb;
import defpackage.atlc;
import defpackage.atld;
import defpackage.atlf;
import defpackage.atlh;
import defpackage.atzb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AudienceView extends FrameLayout {
    private static Context c;
    public final atld a;
    public atlh b;
    private final Context d;

    public AudienceView(Context context) {
        this(context, null, 0);
    }

    private static Pair b(Context context) {
        atld atlbVar;
        if (c == null) {
            c = asxd.b(context);
        }
        Context context2 = c;
        if (context2 != null) {
            try {
                IBinder iBinder = (IBinder) context2.getClassLoader().loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance();
                if (iBinder == null) {
                    atlbVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                    atlbVar = queryLocalInterface instanceof atld ? (atld) queryLocalInterface : new atlb(iBinder);
                }
                return new Pair(atlbVar, c);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return new Pair(new atlc(), context);
    }

    public final void a(Audience audience) {
        try {
            this.a.e(audience);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("parent");
        atzb.s(parcelable2);
        super.onRestoreInstanceState(parcelable2);
        try {
            atld atldVar = this.a;
            Bundle bundle2 = bundle.getBundle("impl");
            atzb.s(bundle2);
            atldVar.d(bundle2);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        try {
            bundle.putBundle("impl", this.a.a());
        } catch (RemoteException unused) {
        }
        return bundle;
    }

    public AudienceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudienceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Pair b = b(context);
        atld atldVar = (atld) b.first;
        this.a = atldVar;
        Context context2 = (Context) b.second;
        this.d = context2;
        try {
            atldVar.c(new ObjectWrapper(getContext()), new ObjectWrapper(context2), new atlf(this));
            addView((View) ObjectWrapper.a(atldVar.b()));
        } catch (RemoteException unused) {
        }
    }
}
