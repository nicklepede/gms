package com.google.android.gms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import defpackage.anzs;
import defpackage.azht;
import defpackage.ccbi;
import defpackage.ccbj;
import defpackage.ccbl;
import defpackage.ccbm;
import defpackage.ccbp;
import defpackage.ccbq;
import defpackage.ccbx;
import defpackage.ccby;
import defpackage.ccca;
import defpackage.cccb;
import defpackage.ccdg;
import defpackage.ccdh;
import defpackage.ccdj;
import defpackage.ccdk;
import defpackage.ccex;
import defpackage.ccey;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class CreatorImpl extends ccbp {
    private int b = -1;
    public ccbq a = null;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());

    private static Object c(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            RemoteException remoteException = new RemoteException();
            remoteException.initCause(e);
            throw remoteException;
        } catch (InstantiationException e2) {
            RemoteException remoteException2 = new RemoteException();
            remoteException2.initCause(e2);
            throw remoteException2;
        }
    }

    private final void d(Context context) {
        if (this.a == null) {
            try {
                Context a = anzs.a(context, "com.google.android.gms.maps_dynamite");
                if (a == null) {
                    throw new RemoteException();
                }
                ClassLoader classLoader = a.getClassLoader();
                Resources resources = a.getResources();
                try {
                    ccbq asInterface = ccbp.asInterface((IBinder) c(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
                    this.a = asInterface;
                    asInterface.initV2(new ObjectWrapper(resources), this.b);
                    Set<ccbj> set = this.c;
                    for (ccbj ccbjVar : set) {
                        Object obj = ccbjVar.a;
                        if (obj instanceof ccbi) {
                            ccbjVar.a = ((ccbi) obj).b();
                        }
                    }
                    set.clear();
                } catch (ClassNotFoundException e) {
                    RemoteException remoteException = new RemoteException();
                    remoteException.initCause(e);
                    throw remoteException;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public final azht a(ccbi ccbiVar) {
        if (this.a != null) {
            return new ObjectWrapper(ccbiVar.b());
        }
        ccbj ccbjVar = new ccbj(ccbiVar);
        this.c.add(ccbjVar);
        return ccbjVar;
    }

    @Override // defpackage.ccbq
    public int getRendererType() {
        return 1;
    }

    @Override // defpackage.ccbq
    public void init(azht azhtVar) {
        initV2(azhtVar, 0);
    }

    @Override // defpackage.ccbq
    public void initV2(azht azhtVar, int i) {
        this.b = i;
    }

    @Override // defpackage.ccbq
    public ccey newBitmapDescriptorFactoryDelegate() {
        return new ccex(this);
    }

    @Override // defpackage.ccbq
    public ccbm newCameraUpdateFactoryDelegate() {
        return new ccbl(this);
    }

    @Override // defpackage.ccbq
    public ccby newMapFragmentDelegate(azht azhtVar) {
        d((Activity) ObjectWrapper.a(azhtVar));
        ccbq ccbqVar = this.a;
        return ccbqVar == null ? new ccbx((Context) ObjectWrapper.a(azhtVar)) : ccbqVar.newMapFragmentDelegate(azhtVar);
    }

    @Override // defpackage.ccbq
    public cccb newMapViewDelegate(azht azhtVar, GoogleMapOptions googleMapOptions) {
        d(((Context) ObjectWrapper.a(azhtVar)).getApplicationContext());
        ccbq ccbqVar = this.a;
        return ccbqVar == null ? new ccca((Context) ObjectWrapper.a(azhtVar)) : ccbqVar.newMapViewDelegate(azhtVar, googleMapOptions);
    }

    @Override // defpackage.ccbq
    public ccdh newStreetViewPanoramaFragmentDelegate(azht azhtVar) {
        d((Activity) ObjectWrapper.a(azhtVar));
        ccbq ccbqVar = this.a;
        return ccbqVar == null ? new ccdg((Context) ObjectWrapper.a(azhtVar)) : ccbqVar.newStreetViewPanoramaFragmentDelegate(azhtVar);
    }

    @Override // defpackage.ccbq
    public ccdk newStreetViewPanoramaViewDelegate(azht azhtVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        d(((Context) ObjectWrapper.a(azhtVar)).getApplicationContext());
        ccbq ccbqVar = this.a;
        return ccbqVar == null ? new ccdj((Context) ObjectWrapper.a(azhtVar)) : ccbqVar.newStreetViewPanoramaViewDelegate(azhtVar, streetViewPanoramaOptions);
    }

    @Override // defpackage.ccbq
    public void preInit(azht azhtVar) {
    }

    @Override // defpackage.ccbq
    public void addInternalUsageAttributionId(azht azhtVar, String str) {
    }

    @Override // defpackage.ccbq
    public void logInitialization(azht azhtVar, int i) {
    }
}
