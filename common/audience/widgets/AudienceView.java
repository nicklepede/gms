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
import defpackage.aquo;
import defpackage.arim;
import defpackage.arin;
import defpackage.ario;
import defpackage.ariq;
import defpackage.aris;
import defpackage.arwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AudienceView extends FrameLayout {
    private static Context c;
    public final ario a;
    public aris b;
    private final Context d;

    public AudienceView(Context context) {
        this(context, null, 0);
    }

    private static Pair b(Context context) {
        ario arimVar;
        if (c == null) {
            c = aquo.b(context);
        }
        Context context2 = c;
        if (context2 != null) {
            try {
                IBinder iBinder = (IBinder) context2.getClassLoader().loadClass("com.google.android.gms.plus.audience.widgets.AudienceViewImpl$DynamiteHost").newInstance();
                if (iBinder == null) {
                    arimVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
                    arimVar = queryLocalInterface instanceof ario ? (ario) queryLocalInterface : new arim(iBinder);
                }
                return new Pair(arimVar, c);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return new Pair(new arin(), context);
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
        arwm.s(parcelable2);
        super.onRestoreInstanceState(parcelable2);
        try {
            ario arioVar = this.a;
            Bundle bundle2 = bundle.getBundle("impl");
            arwm.s(bundle2);
            arioVar.d(bundle2);
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
        ario arioVar = (ario) b.first;
        this.a = arioVar;
        Context context2 = (Context) b.second;
        this.d = context2;
        try {
            arioVar.c(new ObjectWrapper(getContext()), new ObjectWrapper(context2), new ariq(this));
            addView((View) ObjectWrapper.a(arioVar.b()));
        } catch (RemoteException unused) {
        }
    }
}
