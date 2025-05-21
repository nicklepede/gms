package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.blmk;
import defpackage.blux;
import defpackage.blva;
import defpackage.fpad;
import defpackage.ijv;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IcingManageSpaceChimeraActivity extends qet implements AdapterView.OnItemClickListener {
    public View j;
    public View k;
    public TextView l;
    public ListView m;
    public TextView n;
    private blux o;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.icing_manage_space_activity);
        this.j = findViewById(R.id.main_view);
        this.k = findViewById(R.id.icing_progress_bar);
        this.l = (TextView) findViewById(R.id.total_size_text);
        ListView listView = (ListView) findViewById(R.id.apps_list);
        this.m = listView;
        listView.setOnItemClickListener(this);
        TextView textView = (TextView) findViewById(R.id.empty_list_view);
        this.n = textView;
        this.m.setEmptyView(textView);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.icing_manage_settings_menu, menu);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        blva blvaVar = (blva) this.m.getAdapter();
        if (blvaVar == null || i < 0 || i >= blvaVar.getCount()) {
            return;
        }
        String str = blvaVar.getItem(i).a;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", str, null));
        startActivity(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.icing_settings_help) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fpad.a.a().B())));
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ijv.e(getContainerActivity());
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        blux bluxVar = this.o;
        if (bluxVar != null) {
            bluxVar.cancel(true);
            this.o = null;
        }
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        blux bluxVar = new blux(this);
        this.o = bluxVar;
        bluxVar.execute(new Void[0]);
        new blmk(getApplicationContext()).p(8004);
    }
}
