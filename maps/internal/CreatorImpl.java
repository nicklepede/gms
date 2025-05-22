package com.google.android.gms.maps.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import defpackage.aqbk;
import defpackage.bblp;
import defpackage.cekc;
import defpackage.cekd;
import defpackage.cekf;
import defpackage.cekg;
import defpackage.cekj;
import defpackage.cekk;
import defpackage.cekr;
import defpackage.ceks;
import defpackage.ceku;
import defpackage.cekv;
import defpackage.cema;
import defpackage.cemb;
import defpackage.cemd;
import defpackage.ceme;
import defpackage.cenr;
import defpackage.cens;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class CreatorImpl extends cekj {
    private int b = -1;
    public cekk a = null;
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
                Context a = aqbk.a(context, "com.google.android.gms.maps_dynamite");
                if (a == null) {
                    throw new RemoteException();
                }
                ClassLoader classLoader = a.getClassLoader();
                Resources resources = a.getResources();
                try {
                    cekk asInterface = cekj.asInterface((IBinder) c(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl")));
                    this.a = asInterface;
                    asInterface.initV2(new ObjectWrapper(resources), this.b);
                    Set<cekd> set = this.c;
                    for (cekd cekdVar : set) {
                        Object obj = cekdVar.a;
                        if (obj instanceof cekc) {
                            cekdVar.a = ((cekc) obj).b();
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

    public final bblp a(cekc cekcVar) {
        if (this.a != null) {
            return new ObjectWrapper(cekcVar.b());
        }
        cekd cekdVar = new cekd(cekcVar);
        this.c.add(cekdVar);
        return cekdVar;
    }

    @Override // defpackage.cekk
    public int getRendererType() {
        return 1;
    }

    @Override // defpackage.cekk
    public void init(bblp bblpVar) {
        initV2(bblpVar, 0);
    }

    @Override // defpackage.cekk
    public void initV2(bblp bblpVar, int i) {
        this.b = i;
    }

    @Override // defpackage.cekk
    public cens newBitmapDescriptorFactoryDelegate() {
        return new cenr(this);
    }

    @Override // defpackage.cekk
    public cekg newCameraUpdateFactoryDelegate() {
        return new cekf(this);
    }

    @Override // defpackage.cekk
    public ceks newMapFragmentDelegate(bblp bblpVar) {
        d((Activity) ObjectWrapper.a(bblpVar));
        cekk cekkVar = this.a;
        return cekkVar == null ? new cekr((Context) ObjectWrapper.a(bblpVar)) : cekkVar.newMapFragmentDelegate(bblpVar);
    }

    @Override // defpackage.cekk
    public cekv newMapViewDelegate(bblp bblpVar, GoogleMapOptions googleMapOptions) {
        d(((Context) ObjectWrapper.a(bblpVar)).getApplicationContext());
        cekk cekkVar = this.a;
        return cekkVar == null ? new ceku((Context) ObjectWrapper.a(bblpVar)) : cekkVar.newMapViewDelegate(bblpVar, googleMapOptions);
    }

    @Override // defpackage.cekk
    public cemb newStreetViewPanoramaFragmentDelegate(bblp bblpVar) {
        d((Activity) ObjectWrapper.a(bblpVar));
        cekk cekkVar = this.a;
        return cekkVar == null ? new cema((Context) ObjectWrapper.a(bblpVar)) : cekkVar.newStreetViewPanoramaFragmentDelegate(bblpVar);
    }

    @Override // defpackage.cekk
    public ceme newStreetViewPanoramaViewDelegate(bblp bblpVar, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        d(((Context) ObjectWrapper.a(bblpVar)).getApplicationContext());
        cekk cekkVar = this.a;
        return cekkVar == null ? new cemd((Context) ObjectWrapper.a(bblpVar)) : cekkVar.newStreetViewPanoramaViewDelegate(bblpVar, streetViewPanoramaOptions);
    }

    @Override // defpackage.cekk
    public void preInit(bblp bblpVar) {
    }

    @Override // defpackage.cekk
    public void addInternalUsageAttributionId(bblp bblpVar, String str) {
    }

    @Override // defpackage.cekk
    public void logInitialization(bblp bblpVar, int i) {
    }
}
