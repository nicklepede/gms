package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import defpackage.asvp;
import defpackage.aswe;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.atzb;
import defpackage.aumo;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d {
    private static final Object g = new Object();
    private static volatile d h;
    asvp a;
    com.google.android.gms.ads.identifier.internal.d b;
    boolean c;
    final Object d = new Object();
    b e;
    final long f;
    private final Context i;

    public d(Context context) {
        atzb.s(context);
        this.i = context.getApplicationContext();
        this.c = false;
        this.f = 30000L;
    }

    public static c a(Context context) {
        return b(context, -1);
    }

    public static c b(Context context, int i) {
        c cVar;
        d dVar = h;
        if (dVar == null) {
            synchronized (g) {
                dVar = h;
                if (dVar == null) {
                    Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                    dVar = new d(context);
                    h = dVar;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (f.a == null) {
            synchronized (f.b) {
                if (f.a == null) {
                    f.a = new f(context);
                }
            }
        }
        f fVar = f.a;
        int i2 = -1;
        int i3 = i == -1 ? 35401 : 35402;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            atzb.k("Calling this from your main thread can lead to deadlock");
            synchronized (dVar) {
                dVar.d();
                atzb.s(dVar.a);
                atzb.s(dVar.b);
                try {
                    cVar = new c(i == -1 ? dVar.b.c() : dVar.b.d(i), dVar.b.n());
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception", e);
                }
            }
            synchronized (dVar.d) {
                b bVar = dVar.e;
                if (bVar != null) {
                    bVar.a.countDown();
                    try {
                        dVar.e.join();
                    } catch (InterruptedException unused) {
                    }
                }
                long j = dVar.f;
                if (j > 0) {
                    dVar.e = new b(dVar, j);
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e(cVar, elapsedRealtime2, null);
            fVar.a(i3, 0, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            Log.i("AdvertisingIdClient", defpackage.a.w(elapsedRealtime2, "GetInfoInternal elapse ", "ms"));
            return cVar;
        } catch (Throwable th) {
            e(null, -1L, th);
            if (th instanceof IOException) {
                i2 = 1;
            } else if (th instanceof asxb) {
                i2 = 9;
            } else if (th instanceof asxc) {
                i2 = 16;
            } else if (th instanceof IllegalStateException) {
                i2 = 8;
            }
            fVar.a(i3, i2, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th;
        }
    }

    static final void e(c cVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            hashMap.put("app_context", "1");
            if (cVar != null) {
                hashMap.put("limit_ad_tracking", true != cVar.b ? "0" : "1");
                String str = cVar.a;
                if (str != null) {
                    hashMap.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new a(hashMap).start();
        }
    }

    public final void c() {
        atzb.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.i;
            if (context == null || this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    aumo.a().b(context, this.a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }

    final synchronized void d() {
        if (!this.c) {
            try {
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                atzb.k("Calling this from your main thread can lead to deadlock");
                synchronized (this) {
                    if (!this.c) {
                        Context context = this.i;
                        try {
                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            int m = aswe.d.m(context);
                            if (m != 0 && m != 2) {
                                throw new IOException("Google Play services not available");
                            }
                            asvp asvpVar = new asvp();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (!aumo.a().d(context, intent, asvpVar, 1)) {
                                    throw new IOException("Connection failure");
                                }
                                this.a = asvpVar;
                                try {
                                    IBinder b = asvpVar.b(10000L, TimeUnit.MILLISECONDS);
                                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    this.b = queryLocalInterface instanceof com.google.android.gms.ads.identifier.internal.d ? (com.google.android.gms.ads.identifier.internal.d) queryLocalInterface : new com.google.android.gms.ads.identifier.internal.b(b);
                                    this.c = true;
                                } catch (InterruptedException unused) {
                                    throw new IOException("Interrupted exception");
                                } catch (Throwable th) {
                                    throw new IOException(th);
                                }
                            } finally {
                                IOException iOException = new IOException(th);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            throw new asxb(9);
                        }
                    }
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
            } catch (Exception e) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    protected final void finalize() {
        c();
        super.finalize();
    }
}
